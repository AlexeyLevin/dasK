package com.alev.dask.util;

import com.alev.dask.domain.Text;
import com.alev.dask.to.TextTo;
import io.aif.language.sentence.separators.classificators.ISeparatorGroupsClassifier;
import io.aif.language.word.IWord;
import io.aif.pipeline.factory.plain.FileTextFactory;
import io.aif.pipeline.factory.plain.ITextFactory;
import io.aif.pipeline.factory.semantic.ISemanticTextFactory;
import io.aif.pipeline.model.ISemanticText;
import io.aif.pipeline.model.IText;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NlpUtil {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private static ITextFactory nlpTextFactory;
    private static ISemanticText semanticText;
    private static String currentFileName;
    private static Charset currentCharset;

    private NlpUtil() {
    }

    public static Text indexing(final String fileName, final TextTo textTo, final Charset charset) {
        Path path = Paths.get(fileName);
        File file = path.toFile();
        System.out.println(file.canRead());
//        FileTextFactory fileTextFactory = new FileTextFactory(path, charset);
//        fileTextFactory.build();
//        currentFileName = fileName;
//        currentCharset = charset;
//        final List<List<IWord.IWordPlaceholder>> sentences = getSentences();
//        final List<String> tokens = getTokens();
//        final Map<ISeparatorGroupsClassifier.Group, Set<Character>> separators = getSeparators();
//        final Set<IWord> words = getWords();
//        final ISemanticText semanticText = getSemanticText(fileName, charset);

        Text domainText = TextTo.fromTo(textTo);
//        if (true) {
//            throw new UnsupportedOperationException();
//        }
        return domainText;
    }

    private static IText getNlpTextFactory(final String fileName, final Charset charset) {
        nlpTextFactory = (nlpTextFactory == null ? new FileTextFactory(Paths.get(fileName), checkCharset(charset)) : nlpTextFactory);
        return nlpTextFactory.build();
    }

    private static List<List<IWord.IWordPlaceholder>> getSentences() {
        return getNlpTextFactory(currentFileName, checkCharset(currentCharset)).sentences();
    }

    private static List<String> getTokens() {
        return getNlpTextFactory(currentFileName, checkCharset(currentCharset)).tokens();
    }

    private static Map<ISeparatorGroupsClassifier.Group, Set<Character>> getSeparators() {
        return getNlpTextFactory(currentFileName, checkCharset(currentCharset)).separators();
    }

    private static Set<IWord> getWords() {
        return getNlpTextFactory(currentFileName, checkCharset(currentCharset)).words();
    }

    private static ISemanticText getSemanticText(final String fileName, final Charset charset) {
        semanticText = (semanticText == null ? ISemanticTextFactory.build(getNlpTextFactory(fileName, charset)) : semanticText);
        return semanticText;
    }

    public static void resetNlpData() {
        nlpTextFactory = null;
        semanticText = null;
        currentFileName = null;
        currentCharset = null;
    }

    private static Charset checkCharset(Charset charset) {
        return charset == null ? DEFAULT_CHARSET : charset;
    }
}
