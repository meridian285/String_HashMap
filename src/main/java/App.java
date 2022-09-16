public class App {

    public static void main(String[] args) {
        String text = "Мишка косолапый по полю идёт, шишки собирает, песенки поёт. Шишка отскочила прямо мишке в лоб. Мишка разозлился и ногою - хлоп!";
        var textFixer = new TextFixer();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }

    static class TextFixer {

        public String fixText(String text) {

            return text.replace("полю","лесу")
                    .replace("разозлился", "рассердился")
                    .replace("хлоп", "топ");
        }
    }
}

