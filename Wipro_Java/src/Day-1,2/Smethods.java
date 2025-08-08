
public class Smethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";

        System.out.println(str.length());
        System.out.println(str.charAt(6));   
        System.out.println(str.substring(6));    
        System.out.println(str.substring(0, 5));
        System.out.println(str.concat("!!!"));

     
        System.out.println(str.equals("Hello World"));
        System.out.println(str.equalsIgnoreCase("hello world"));
        System.out.println(str.compareTo("Hello"));
        System.out.println(str.compareToIgnoreCase("hello"));
        System.out.println(str.compareTo("Hello World!!!"));

       
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("World"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.contains("World"));
        System.out.println(str.startsWith("Hel"));
        System.out.println(str.endsWith("ld"));

       
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String padded = "   trim me   ";
        System.out.println(padded.trim());
        System.out.println(str.replace('o', 'x'));
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.replaceAll("l", "L"));
        System.out.println(str.replaceFirst("l", "L"));


        System.out.println(str.matches(".*World"));

        String s1 = new String("hello").intern();
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println("".isEmpty());
        System.out.println("   ".isBlank());

	}

}
