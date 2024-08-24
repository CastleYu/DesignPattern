package annotationToDesignPattern;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("annotationToDesignPattern.Singleton")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SingletonProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Singleton.class)) {
            if (element.getKind() == ElementKind.CLASS) {
                boolean hasPrivateConstructor = false;
                for (Element enclosed : element.getEnclosedElements()) {
                    if (enclosed.getKind() == ElementKind.CONSTRUCTOR &&
                            enclosed.getModifiers().contains(Modifier.PRIVATE)) {
                        hasPrivateConstructor = true;
                        break;
                    }
                }
                if (!hasPrivateConstructor) {
                    processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.ERROR,
                            "The class " + element.getSimpleName() + " is annotated with @Singleton but does not have a private constructor.", element);
                }
            }
        }
        return true;
    }
}
