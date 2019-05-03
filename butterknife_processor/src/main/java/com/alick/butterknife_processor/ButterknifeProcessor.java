package com.alick.butterknife_processor;

import com.alick.butterknife_annotation.BindView;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 * @author 崔兴旺
 * @package com.alick.butterknife_processor
 * @title:
 * @description:
 * @date 2019/5/2 23:05
 */
@AutoService(Processor.class)
public class ButterknifeProcessor extends AbstractProcessor {
    private final String packagename = "com.alick.butterknifelearn";

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> strings = new HashSet<>();
        strings.add(BindView.class.getCanonicalName());
        return strings;
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        TypeSpec typeSpec = TypeSpec.classBuilder(BindView.class.getCanonicalName())
                .addModifiers(Modifier.PUBLIC)
                .build();

        JavaFile javaFile = JavaFile.builder(packagename, typeSpec).build();
        javaFile.writeTo(processingEnv.getFiler());

        return true;
    }


}
