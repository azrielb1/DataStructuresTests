public class WordCountTest {
    
    @Test
    public void TestWordCount() throws URISyntaxException {
        URI uri = new URI("hello");
        Document d = new DocumentImpl(uri, "This string has some words in this string");
        assertEquals(2, d.wordCount("this"));
        assertEquals(2, d.wordCount("STRING"));
        assertEquals(1, d.wordCount("sOme"));
        assertEquals(0, d.wordCount("nothere"));
        
        d = new DocumentImpl(uri, "word-word!word-word");
        assertEquals(0, d.wordCount("word"));
        assertEquals(1, d.wordCount("wordwordwordword"));
    }

    @Test
    public void testLongDocument() throws URISyntaxException {
        String s = "";
        for (int i = 0; i < 700; i++) {
            s += "word ";
        }
        URI uri = new URI("hello");
        Document d = new DocumentImpl(uri, s);
        assertEquals(700, d.wordCount("word"));
    }

}
