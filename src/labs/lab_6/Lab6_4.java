package labs.lab_6;

public class Lab6_4 {

    public static void main(String[] args) {
    /*
    String url = "https://google.com";
    Check http OR https; domain name, .com OR .net
     */
        String url = "https://google.com";
        if (url.startsWith("https://")){
            System.out.println("Protocol is https");
        }else if (url.startsWith("http://")){
            System.out.println("Protocol is http");
        }else {
            System.out.println("Invalid Protocol");
        }

        if (url.endsWith(".com")){
            System.out.println("Top-level domain is .com");
        }else if (url.endsWith(".net")){
            System.out.println("Top-level domain is .net");
        }else {
            System.out.println("Other top-level domain");
        }
    }
}