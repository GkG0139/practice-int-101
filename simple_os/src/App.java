import application.Application;
import os.OS;

public class App {

  public static void main(String[] args) throws Exception {
    testApplication();
    testOS();
    testAddAppToOS();
    testRemoveAppFromOS();
    testgetApplicationIdByName();
  }

  private static void testApplication() {
    Application app1 = new Application(
      "Apple Music",
      "This app made by Apple",
      100
    );
    System.out.println(app1);
    Application app2 = new Application(
      "Spotify",
      "This app is very popular",
      1000
    );
    System.out.println(app2);
    System.out.println("==============");
  }

  private static void testOS() {
    OS os1 = new OS("Andriod", 1500);
    OS os2 = new OS("iOS", 1000);
    System.out.println(os1);
    System.out.println(os2);
    System.out.println("==============");
  }

  private static void testAddAppToOS() {
    OS os1 = new OS("Andriod", 1500);
    Application app1 = new Application(
      "Apple Music",
      "This app made by Apple",
      100
    );
    Application app2 = new Application(
      "Spotify",
      "This app is very popular",
      1000
    );
    os1.addApplication(app1);
    os1.addApplication(app2);
    System.out.println(os1);

    System.out.println("==============");

    OS os2 = new OS("iOS", 10000);
    Application app3 = new Application(
      "JOOX",
      "This app is popular in Thai",
      600
    );
    os2.addApplication(app1);
    os2.addApplication(app2);
    os2.addApplication(app3);
    System.out.println(os2);

    System.out.println("==============");
  }

  private static void testRemoveAppFromOS() {
    OS os2 = new OS("iOS", 3000);
    Application app1 = new Application(
      "Apple Music",
      "This app made by Apple",
      100
    );
    Application app2 = new Application(
      "Spotify",
      "This app is very popular",
      1000
    );
    Application app3 = new Application(
      "JOOX",
      "This app is popular in Thai",
      600
    );
    os2.addApplication(app1);
    os2.addApplication(app2);
    os2.addApplication(app3);

    os2.removeApplication(app2.getId());
    os2.removeApplication(app3.getId());

    System.out.println(os2);
    System.out.println("==============");
  }

  private static void testgetApplicationIdByName() {
    OS os2 = new OS("iOS", 3000);
    Application app1 = new Application(
      "Apple Music",
      "This app made by Apple",
      100
    );
    Application app2 = new Application(
      "Spotify",
      "This app is very popular",
      1000
    );
    Application app3 = new Application(
      "JOOX",
      "This app is popular in Thai",
      600
    );
    os2.addApplication(app1);
    os2.addApplication(app2);
    os2.addApplication(app3);

    System.out.println(os2.getApplicationIdByName(app3.getName()));
  }
}
