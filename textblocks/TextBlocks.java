package textblocks;

public class TextBlocks {
    public TextBlocks() {
        String html =
                """
               <html>
                     <body>
                         <p>Hello World</p>
                      </body>
               </html>
                """;
        System.out.println(html);
    }

    public static void main(String[] args) {
        new TextBlocks();
    }
}
