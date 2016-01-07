import com.rmtheis.yandtran.language.Language;
import com.rmtheis.yandtran.translate.Translate;

public class test {
    public static void main(String[] args) throws Exception {
        Translate.setKey("trnsl.1.1.20151208T214555Z.b8f9acaab84ad44d.8310d18af232434575253d7d2ace8b3a69cb8158");

        String translatedText = Translate.execute("Hola, mundo!", Language.SPANISH, Language.ENGLISH);

        System.out.println(translatedText);
    }
}