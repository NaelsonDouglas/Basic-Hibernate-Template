
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test001"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", (int)(byte)-1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test002"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", (int)'a');
    java.lang.String str3 = person2.reportIn();
    person2.setID(10);
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test003"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test004"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n", (int)' ');

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test005"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    person2.setID((int)'#');
    int i6 = person2.getID();
    int i7 = person2.getID();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test006"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test007"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    person2.setID((-1));
    java.lang.String str10 = person2.reportIn();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test008"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    person2.setID(0);
    int i8 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str11 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"+ "'", str11.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test009"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    person2.setID(0);
    person2.setID((int)'4');
    java.lang.String str10 = person2.reportIn();
    person2.setID(52);
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test010"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test011"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    java.lang.String str3 = person2.getName();
    person2.setID((int)' ');
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test012"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(short)0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test013"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)-1);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'4');
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    person2.setID((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test014"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)(short)100);
    person2.setID(0);
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test015"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", (int)(short)100);
    person2.setID(97);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test016"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)' ');

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test017"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)100);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test018"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 0\n", (int)' ');
    person2.setID(0);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test019"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test020"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n", (int)(byte)100);
    person2.setID((int)(byte)-1);
    person2.setID((int)(byte)1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test021"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test022"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", 52);
    person2.setID(0);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(short)100);
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test023"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: -1\n", 35);
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.getName();
    person2.setID(35);
    person2.setID(0);
    int i10 = person2.getID();
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test024"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (-1));
    int i3 = person2.getID();
    person2.setID((int)(byte)1);
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test025"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test026"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test027"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 32\n", 10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test028"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 97);
    java.lang.String str3 = person2.reportIn();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test029"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (-1));
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test030"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    person2.setID((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test031"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test032"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", (int)(byte)10);
    person2.setID(0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test033"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)'a');
    person2.setID((int)'#');
    person2.setID((int)'4');
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str12.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str13.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test034"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)10);
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test035"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (-1));
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(short)100);
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test036"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", (int)(short)-1);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)(short)0);
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test037"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n", (int)(byte)1);
    int i3 = person2.getID();
    person2.setID(32);
    person2.setID((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test038"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test039"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    int i11 = person2.getID();
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test040"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)'#');
    person2.setID(1);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test041"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str12 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test042"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 97);
    person2.setID(52);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test043"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(short)10);
    person2.setID(52);
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test044"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    person2.setID(0);
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test045"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", (int)'a');
    person2.setID((int)'4');
    person2.setID((-1));
    person2.setID(35);
    person2.setID(1);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test046"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    int i5 = person2.getID();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID((int)(byte)1);
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str11.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test047"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)'#');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test048"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", (int)(short)0);
    person2.setID((int)'a');
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test049"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID(35);
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test050"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n", 100);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test051"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test052"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n", (int)(byte)1);
    person2.setID((int)(short)-1);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test053"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n", (int)'#');

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test054"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)-1);
    person2.setID(100);
    java.lang.String str7 = person2.reportIn();
    person2.setID(10);
    int i10 = person2.getID();
    person2.setID((int)'a');
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test055"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", (int)(byte)100);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test056"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)10);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    person2.setID(10);
    java.lang.String str10 = person2.reportIn();
    person2.setID(52);
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str10.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test057"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)100);
    int i3 = person2.getID();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test058"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    int i9 = person2.getID();
    int i10 = person2.getID();
    int i11 = person2.getID();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    person2.setID((int)(byte)10);
    java.lang.String str16 = person2.getName();
    person2.setID(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test059"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n", 10);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test060"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 32\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test061"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)100);
    person2.setID((int)(short)100);
    person2.setID((int)'#');
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID(32);
    java.lang.String str11 = person2.reportIn();
    person2.setID(52);
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n"+ "'", str11.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test062"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", 0);
    java.lang.String str3 = person2.getName();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test063"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test064"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", 52);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test065"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)'#');
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test066"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", 0);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test067"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (-1));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test068"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", 32);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test069"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)10);
    java.lang.String str6 = person2.reportIn();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test070"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.reportIn();
    person2.setID((int)(short)0);
    java.lang.String str15 = person2.getName();
    java.lang.String str16 = person2.reportIn();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test071"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test072"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test073"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n", (int)(byte)10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test074"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n", 97);
    person2.setID((int)(byte)-1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test075"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test076"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n", 35);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test077"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", (int)(short)0);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test078"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", 35);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test079"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    int i7 = person2.getID();
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test080"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)(byte)0);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test081"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 35);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test082"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", 100);
    person2.setID(35);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test083"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test084"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test085"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test086"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)100);
    person2.setID((int)(short)100);
    person2.setID((int)(byte)1);
    person2.setID((int)(short)1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test087"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    int i11 = person2.getID();
    person2.setID((int)(byte)100);
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test088"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)'a');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test089"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", 32);
    int i3 = person2.getID();
    int i4 = person2.getID();
    int i5 = person2.getID();
    person2.setID(1);
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test090"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 10\n", (-1));
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test091"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(byte)1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test092"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n", (int)(byte)10);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test093"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    person2.setID(0);
    person2.setID(35);
    java.lang.String str9 = person2.getName();
    int i10 = person2.getID();
    person2.setID(0);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test094"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", (int)'a');
    java.lang.String str3 = person2.reportIn();
    person2.setID(10);
    person2.setID(1);
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test095"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    person2.setID(52);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test096"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", 35);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test097"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test098"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    person2.setID((-1));
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test099"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (int)(byte)1);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test100"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)(short)0);
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(byte)1);
    java.lang.String str12 = person2.getName();
    person2.setID((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test101"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", 32);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    int i5 = person2.getID();
    person2.setID((int)'4');
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test102"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    person2.setID((int)(byte)100);
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    int i14 = person2.getID();
    int i15 = person2.getID();
    person2.setID(32);
    int i18 = person2.getID();
    person2.setID(35);
    person2.setID((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str13.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test103"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    person2.setID((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test104"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n", (int)(byte)100);
    person2.setID(10);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test105"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    person2.setID((int)(byte)100);
    person2.setID((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test106"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (int)'#');
    java.lang.String str3 = person2.getName();
    person2.setID(35);
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test107"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)'#');
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test108"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    int i8 = person2.getID();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test109"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n", (int)(short)1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test110"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", 100);
    person2.setID(35);
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test111"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)(byte)0);
    person2.setID(52);
    person2.setID((int)(short)100);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test112"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n", (int)'4');
    person2.setID(35);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test113"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(short)10);
    java.lang.String str9 = person2.reportIn();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test114"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", (int)(short)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(short)0);
    java.lang.String str8 = person2.reportIn();
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test115"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n", (-1));
    person2.setID(1);
    java.lang.String str5 = person2.reportIn();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test116"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test117"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", (int)(short)0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test118"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", (int)(short)-1);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test119"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    person2.setID((int)' ');
    java.lang.String str13 = person2.getName();
    java.lang.String str14 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str14.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test120"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", 0);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test121"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test122"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", (int)' ');

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test123"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", 52);
    int i3 = person2.getID();
    person2.setID((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test124"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    person2.setID(10);
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.reportIn();
    person2.setID((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test125"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n", 52);
    person2.setID(100);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test126"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    person2.setID((int)'a');
    person2.setID((int)(short)-1);
    person2.setID((int)(short)1);
    java.lang.String str10 = person2.getName();
    person2.setID((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test127"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)(byte)100);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test128"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)' ');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test129"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", (int)'a');
    int i3 = person2.getID();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test130"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(byte)1);
    person2.setID(97);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test131"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    person2.setID((int)' ');
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test132"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n", 32);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test133"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", (int)(short)1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test134"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    int i5 = person2.getID();
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test135"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", 97);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test136"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test137"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", 10);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test138"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n", 32);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test139"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", (int)'4');

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test140"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n", 0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test141"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)1);
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    int i10 = person2.getID();
    person2.setID((int)(byte)1);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test142"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    person2.setID(10);
    int i10 = person2.getID();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test143"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test144"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID((int)(byte)-1);
    person2.setID(32);
    java.lang.String str9 = person2.reportIn();
    person2.setID((-1));
    person2.setID(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test145"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", 32);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test146"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", (int)(short)0);
    person2.setID((int)(short)100);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test147"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(byte)1);
    java.lang.String str5 = person2.getName();
    person2.setID(35);
    int i8 = person2.getID();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    person2.setID(100);
    java.lang.String str13 = person2.getName();
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test148"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)10);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test149"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)'4');

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test150"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    int i5 = person2.getID();
    person2.setID((int)'a');
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test151"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test152"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", 0);
    person2.setID((int)(byte)100);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test153"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test154"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", (int)(byte)10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test155"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (-1));
    java.lang.String str3 = person2.getName();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test156"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    person2.setID((int)' ');
    person2.setID((int)(byte)1);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test157"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)0);
    int i3 = person2.getID();
    person2.setID((int)'4');
    int i6 = person2.getID();
    person2.setID((int)'a');
    person2.setID(32);
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test158"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str10.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test159"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", (int)'a');
    int i3 = person2.getID();
    person2.setID(52);
    person2.setID((int)(byte)-1);
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test160"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n", (int)'#');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test161"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    person2.setID(32);
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str10.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str11.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test162"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", 10);
    person2.setID((int)(byte)1);
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test163"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    int i3 = person2.getID();
    person2.setID((int)(short)10);
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    person2.setID((int)(short)100);
    int i10 = person2.getID();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test164"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    java.lang.String str14 = person2.reportIn();
    java.lang.String str15 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str14.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test165"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(byte)0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test166"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", (int)'a');
    person2.setID((int)'4');
    person2.setID((-1));
    person2.setID(35);
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test167"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)100);
    person2.setID((int)(short)100);
    person2.setID((int)'#');
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    int i9 = person2.getID();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str10.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test168"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    person2.setID((int)'a');
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    person2.setID((int)(byte)10);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test169"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", (int)(short)0);
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test170"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test171"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 52);
    person2.setID((int)(short)-1);
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test172"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)'4');
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test173"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(byte)0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test174"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test175"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (-1));
    person2.setID((int)(byte)1);
    person2.setID((int)(short)-1);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test176"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    person2.setID(1);
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    person2.setID((int)'a');
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test177"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)'4');
    java.lang.String str12 = person2.reportIn();
    person2.setID((-1));
    person2.setID(0);
    person2.setID((int)(short)1);
    java.lang.String str19 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str19.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test178"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n", 0);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test179"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID(32);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test180"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", 35);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test181"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test182"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    int i7 = person2.getID();
    int i8 = person2.getID();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test183"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n", 35);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test184"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n", 35);
    person2.setID((int)'a');

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test185"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test186"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)100);
    int i3 = person2.getID();
    person2.setID(97);
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test187"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'4');
    int i6 = person2.getID();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test188"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 100);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test189"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", 10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test190"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test191"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test192"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", 100);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test193"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n", (int)(byte)-1);
    person2.setID((int)' ');

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test194"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test195"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    person2.setID((int)'a');
    person2.setID((int)'#');
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test196"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 100);
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test197"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    person2.setID(0);
    int i8 = person2.getID();
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test198"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(byte)100);
    person2.setID((int)(byte)-1);
    person2.setID((int)(short)10);
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test199"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n", (int)'#');
    person2.setID(32);
    person2.setID(35);
    person2.setID(0);
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test200"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", 35);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test201"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", (int)(byte)-1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test202"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    person2.setID((int)(byte)0);
    person2.setID((int)(short)10);
    java.lang.String str12 = person2.reportIn();
    person2.setID(100);
    java.lang.String str15 = person2.getName();
    int i16 = person2.getID();
    java.lang.String str17 = person2.getName();
    java.lang.String str18 = person2.reportIn();
    int i19 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str17.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str18.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test203"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", (int)(short)-1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test204"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 52\n", (int)(byte)10);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test205"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID(52);
    java.lang.String str8 = person2.getName();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test206"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", 1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test207"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    int i13 = person2.getID();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test208"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)(short)100);
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test209"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", 10);
    person2.setID((int)' ');
    person2.setID((int)(byte)1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test210"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (int)'4');
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test211"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n", (int)(byte)-1);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test212"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    person2.setID((int)(byte)0);
    person2.setID((int)(short)10);
    int i12 = person2.getID();
    int i13 = person2.getID();
    int i14 = person2.getID();
    java.lang.String str15 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str15.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test213"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n", (int)'a');

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test214"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    person2.setID(0);
    person2.setID(100);
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test215"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 97);
    person2.setID((int)'#');
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)100);
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test216"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n", 0);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test217"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", (int)(short)10);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test218"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", (int)'#');

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test219"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(byte)1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test220"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test221"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(short)0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test222"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test223"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test224"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test225"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n", (int)(byte)0);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test226"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", 97);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test227"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test228"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n", (int)(byte)1);
    person2.setID(0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test229"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)10);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test230"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", (int)'4');
    person2.setID(97);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test231"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (-1));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test232"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    person2.setID((int)(byte)0);
    person2.setID((int)(short)-1);
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test233"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n", (int)(short)0);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test234"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    person2.setID(100);
    java.lang.String str13 = person2.getName();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test235"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    person2.setID(0);
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test236"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n", 97);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test237"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    int i11 = person2.getID();
    person2.setID((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test238"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 35\n", 32);
    person2.setID(0);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test239"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    person2.setID(0);
    person2.setID(35);
    person2.setID((int)(short)-1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test240"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    person2.setID((int)' ');
    java.lang.String str11 = person2.reportIn();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"+ "'", str11.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test241"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test242"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(byte)0);
    person2.setID(0);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test243"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n", 1);
    person2.setID(0);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test244"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)(byte)10);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test245"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", 1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test246"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)0);
    int i3 = person2.getID();
    person2.setID((int)'4');
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((int)(short)0);
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test247"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(byte)10);
    person2.setID(97);
    person2.setID((int)(byte)-1);
    person2.setID(100);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test248"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(short)10);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test249"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n", (int)(byte)0);
    person2.setID(0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test250"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", 10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test251"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)1);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test252"); }


    personal.Person person2 = new personal.Person("hi!", 100);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test253"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)' ');
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test254"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test255"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    person2.setID((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test256"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", (int)(short)0);
    int i3 = person2.getID();
    person2.setID((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test257"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(short)0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test258"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", (int)(byte)0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test259"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)'4');
    person2.setID(52);
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test260"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", 10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    person2.setID(97);
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test261"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", (int)'a');
    person2.setID((int)'#');
    person2.setID((int)(short)100);
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test262"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", 35);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test263"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)10);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test264"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", 52);
    int i3 = person2.getID();
    person2.setID(0);
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test265"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 97\n", (int)'4');

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test266"); }


    personal.Person person2 = new personal.Person("hi!", 10);
    person2.setID(100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test267"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test268"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n", (int)(short)10);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test269"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 100);
    person2.setID((int)(byte)-1);
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test270"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)'a');
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test271"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", 10);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test272"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", (int)(short)100);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test273"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 32\n", 10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test274"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 100);
    person2.setID((int)'a');
    person2.setID((int)(short)100);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test275"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n", (int)' ');
    person2.setID(100);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test276"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", (int)(byte)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)(short)1);
    person2.setID((int)'4');
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test277"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test278"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (int)(short)10);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test279"); }


    personal.Person person2 = new personal.Person("", (int)(byte)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test280"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID(97);
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test281"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n", 0);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test282"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", (int)(short)-1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test283"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n", 35);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test284"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test285"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", (int)(short)-1);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test286"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test287"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n", (int)' ');

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test288"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 100);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)10);
    person2.setID((int)(byte)0);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test289"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test290"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    person2.setID((int)(byte)1);
    person2.setID(1);
    person2.setID((int)' ');
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    int i15 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str13.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test291"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test292"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    person2.setID((int)(byte)100);
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    person2.setID(0);
    person2.setID((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str13.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test293"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID((int)(short)10);
    int i11 = person2.getID();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test294"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test295"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (-1));
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test296"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 35\n", (int)(byte)10);
    person2.setID((int)(byte)10);
    person2.setID((int)(short)-1);
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test297"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID((int)(byte)-1);
    person2.setID((int)(byte)100);
    person2.setID((int)(byte)10);
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test298"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    person2.setID((-1));
    person2.setID((int)'#');
    java.lang.String str12 = person2.reportIn();
    int i13 = person2.getID();
    int i14 = person2.getID();
    java.lang.String str15 = person2.getName();
    java.lang.String str16 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str16.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test299"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n", (int)(short)1);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test300"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(short)-1);
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    int i10 = person2.getID();
    person2.setID((int)(short)10);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str13.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test301"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test302"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test303"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", (int)(short)10);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test304"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n", 0);
    person2.setID((int)(short)-1);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test305"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n", (int)(byte)0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test306"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    person2.setID(32);
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test307"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test308"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", 100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test309"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (-1));
    person2.setID(0);
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test310"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test311"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test312"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", (int)'a');
    person2.setID((int)(short)100);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test313"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    person2.setID((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test314"); }


    personal.Person person2 = new personal.Person("", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    person2.setID(0);
    person2.setID(0);
    person2.setID((int)(short)10);
    person2.setID(0);
    java.lang.String str13 = person2.reportIn();
    java.lang.String str14 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: \nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test315"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", 10);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test316"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)100);
    person2.setID(10);
    person2.setID((int)'4');
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test317"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 52);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test318"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(byte)0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test319"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(short)10);
    person2.setID((int)(byte)-1);
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)10);
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test320"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (int)'a');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test321"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", 32);
    person2.setID((int)(short)-1);
    person2.setID(1);
    person2.setID((int)(byte)1);
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test322"); }


    personal.Person person2 = new personal.Person("", 52);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    person2.setID((int)(byte)100);
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test323"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n", (int)'#');
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test324"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", (int)(short)-1);
    int i3 = person2.getID();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test325"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", (int)'a');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test326"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)' ');
    person2.setID((int)(short)-1);
    person2.setID(0);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test327"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)0);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test328"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", 97);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test329"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 1);
    person2.setID((int)'a');

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test330"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(short)10);
    person2.setID((int)(byte)-1);
    java.lang.String str5 = person2.getName();
    person2.setID((int)'4');
    person2.setID((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test331"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    person2.setID((int)(byte)0);
    person2.setID((int)(short)10);
    person2.setID((int)(byte)10);
    java.lang.String str14 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test332"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)'#');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test333"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", (int)' ');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test334"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    person2.setID((int)(short)100);
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test335"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID(1);
    person2.setID((int)(short)-1);
    person2.setID((int)(short)0);
    java.lang.String str15 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test336"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)'a');
    person2.setID((int)(short)10);
    person2.setID((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test337"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    person2.setID((int)'4');
    person2.setID(100);
    int i9 = person2.getID();
    person2.setID((int)'#');
    int i12 = person2.getID();
    int i13 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test338"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n", 97);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test339"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", 1);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test340"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test341"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 100);
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test342"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.reportIn();
    person2.setID(52);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.getName();
    int i13 = person2.getID();
    int i14 = person2.getID();
    java.lang.String str15 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test343"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)100);
    int i3 = person2.getID();
    person2.setID(100);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test344"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", 97);
    person2.setID(0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test345"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    person2.setID(52);
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test346"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n", (int)(short)10);
    int i3 = person2.getID();
    person2.setID((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test347"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 52\n", (int)' ');
    java.lang.String str3 = person2.reportIn();
    person2.setID(32);
    person2.setID(97);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test348"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 1);
    person2.setID((int)(byte)10);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test349"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test350"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test351"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)100);
    int i3 = person2.getID();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    person2.setID(1);
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test352"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", 0);
    java.lang.String str3 = person2.reportIn();
    person2.setID(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test353"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n", (int)(byte)-1);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test354"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n", 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test355"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID(10);
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test356"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    person2.setID((int)'#');
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test357"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 32\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    person2.setID(1);
    java.lang.String str6 = person2.reportIn();
    person2.setID((int)(short)1);
    java.lang.String str9 = person2.getName();
    person2.setID(97);
    person2.setID((int)'#');
    person2.setID((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test358"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(short)1);
    person2.setID((int)(short)10);
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)0);
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test359"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(byte)10);
    int i3 = person2.getID();
    person2.setID((int)'4');
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    person2.setID((int)'4');
    person2.setID(10);
    person2.setID(100);
    java.lang.String str14 = person2.reportIn();
    java.lang.String str15 = person2.getName();
    int i16 = person2.getID();
    java.lang.String str17 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str14.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str15.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str17.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test360"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (-1));
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test361"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 1\n", 0);
    person2.setID(52);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test362"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n", (int)(short)0);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test363"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test364"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 32);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test365"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    int i3 = person2.getID();
    int i4 = person2.getID();
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test366"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", 10);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test367"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n", (int)(short)100);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test368"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(short)10);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    person2.setID((int)' ');
    person2.setID((-1));
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test369"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", (int)' ');

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test370"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    person2.setID(35);
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    person2.setID(1);
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str13.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test371"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(byte)-1);
    person2.setID((int)(short)10);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.getName();
    person2.setID((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test372"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)10);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test373"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(byte)0);
    person2.setID(52);
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test374"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)' ');

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test375"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (int)'#');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test376"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 100);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test377"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n", (int)'#');
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test378"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test379"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    person2.setID(10);
    int i12 = person2.getID();
    person2.setID((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test380"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", (int)'a');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test381"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n", (int)'4');
    person2.setID((int)(byte)-1);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test382"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", 100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    person2.setID((int)'a');
    person2.setID(1);
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test383"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", 100);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test384"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n", (int)'4');
    int i3 = person2.getID();
    person2.setID((int)(short)0);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test385"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", 35);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test386"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 10);
    person2.setID((int)'4');
    person2.setID((int)'a');

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test387"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n", 10);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test388"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test389"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)10);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.getName();
    person2.setID(10);
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test390"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", (int)'a');
    int i3 = person2.getID();
    person2.setID(32);
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test391"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 35\n", 1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test392"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    int i5 = person2.getID();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID((int)(byte)1);
    java.lang.String str11 = person2.reportIn();
    person2.setID((int)(short)1);
    java.lang.String str14 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str11.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str14.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test393"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", (int)(byte)1);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test394"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n", (int)'#');

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test395"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)0);
    person2.setID(10);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test396"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)(short)1);
    person2.setID(52);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test397"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n", (int)(short)10);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test398"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    person2.setID((-1));
    person2.setID((int)'#');
    java.lang.String str12 = person2.reportIn();
    int i13 = person2.getID();
    int i14 = person2.getID();
    java.lang.String str15 = person2.getName();
    int i16 = person2.getID();
    person2.setID(0);
    int i19 = person2.getID();
    java.lang.String str20 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str20.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test399"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", 52);
    person2.setID((int)(byte)10);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test400"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    person2.setID(0);
    java.lang.String str10 = person2.reportIn();
    person2.setID(100);
    java.lang.String str13 = person2.getName();
    java.lang.String str14 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str14.equals("Nome: \nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test401"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test402"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID((int)'#');
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test403"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n", (-1));
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test404"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(byte)10);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test405"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", 100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    int i5 = person2.getID();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test406"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test407"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)'a');
    java.lang.String str3 = person2.reportIn();
    person2.setID(1);
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((int)'a');
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test408"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test409"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n", (int)(byte)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test410"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    person2.setID((int)' ');
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test411"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test412"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", 52);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test413"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", (int)(byte)100);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test414"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    person2.setID((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test415"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    int i11 = person2.getID();
    person2.setID(97);
    java.lang.String str14 = person2.getName();
    java.lang.String str15 = person2.getName();
    int i16 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test416"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)(short)0);
    int i9 = person2.getID();
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test417"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n", (int)'a');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)1);
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test418"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(short)1);
    person2.setID((int)(byte)1);
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test419"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    person2.setID(0);
    int i12 = person2.getID();
    java.lang.String str13 = person2.getName();
    person2.setID(100);
    int i16 = person2.getID();
    java.lang.String str17 = person2.reportIn();
    int i18 = person2.getID();
    int i19 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str17.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test420"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test421"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    person2.setID((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test422"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    person2.setID(0);
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test423"); }


    personal.Person person2 = new personal.Person("", (int)(byte)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(byte)100);
    person2.setID(1);
    person2.setID(1);
    int i12 = person2.getID();
    person2.setID(52);
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str15.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test424"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", 10);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test425"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 35);
    person2.setID(10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test426"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    person2.setID(0);
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    int i13 = person2.getID();
    java.lang.String str14 = person2.getName();
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.reportIn();
    person2.setID(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test427"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test428"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n", 100);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test429"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test430"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID((int)(byte)0);
    person2.setID((int)(short)100);
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str10.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test431"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(byte)0);
    person2.setID((-1));
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test432"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test433"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", (int)(byte)100);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test434"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n", (int)(byte)0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test435"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)' ');
    person2.setID(52);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test436"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(short)1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(short)10);
    person2.setID((int)(byte)10);
    int i11 = person2.getID();
    person2.setID((-1));
    person2.setID((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test437"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: -1\n", 97);
    person2.setID(52);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test438"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 97\n", 97);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test439"); }


    personal.Person person2 = new personal.Person("", (int)(short)100);
    person2.setID((int)' ');
    person2.setID((int)'4');
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test440"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    int i7 = person2.getID();
    person2.setID((int)(byte)-1);
    person2.setID(100);
    int i12 = person2.getID();
    int i13 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test441"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test442"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    person2.setID(0);
    person2.setID(35);
    java.lang.String str9 = person2.getName();
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    person2.setID(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test443"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n", (int)(byte)0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test444"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(short)1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test445"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)' ');
    java.lang.String str3 = person2.reportIn();
    person2.setID(0);
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test446"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n", 97);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test447"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 35);
    person2.setID((int)(byte)100);
    person2.setID((int)(short)0);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test448"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test449"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(byte)0);
    int i9 = person2.getID();
    person2.setID((int)(byte)-1);
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test450"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n", (int)(short)1);
    person2.setID((int)(byte)1);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test451"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", 1);
    person2.setID(0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test452"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", 100);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test453"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 32\n", (int)(short)10);
    person2.setID(97);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test454"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str13 = person2.reportIn();
    java.lang.String str14 = person2.reportIn();
    int i15 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test455"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test456"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 35);
    int i3 = person2.getID();
    int i4 = person2.getID();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test457"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    int i10 = person2.getID();
    int i11 = person2.getID();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.getName();
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test458"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test459"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", (int)'#');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test460"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    person2.setID((int)(byte)10);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test461"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(byte)-1);
    person2.setID((-1));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test462"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", (int)(byte)1);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test463"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 0);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test464"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(short)100);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test465"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: -1\n", 32);
    person2.setID(0);
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test466"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", 52);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test467"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(byte)100);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test468"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", 1);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test469"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    person2.setID((int)'4');
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test470"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n", (int)'#');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test471"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test472"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n", (-1));
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test473"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(byte)-1);
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test474"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", 1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test475"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n", 10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test476"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 97\n", (int)(short)1);
    int i3 = person2.getID();
    int i4 = person2.getID();
    int i5 = person2.getID();
    int i6 = person2.getID();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test477"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    person2.setID(10);
    java.lang.String str9 = person2.getName();
    person2.setID((int)(byte)100);
    int i12 = person2.getID();
    java.lang.String str13 = person2.getName();
    person2.setID(32);
    java.lang.String str16 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 32\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test478"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    person2.setID(35);
    person2.setID((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test479"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n", (int)(byte)100);
    person2.setID(10);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test480"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 52);
    person2.setID((int)(short)-1);
    person2.setID((int)(short)-1);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test481"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", 32);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test482"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 10);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test483"); }


    personal.Person person2 = new personal.Person("", (int)(short)0);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test484"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", 100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test485"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n", 35);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test486"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n", (int)' ');
    person2.setID((-1));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test487"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)' ');
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test488"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    int i11 = person2.getID();
    person2.setID(100);
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test489"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n", 100);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test490"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID(1);
    person2.setID((int)(short)-1);
    int i13 = person2.getID();
    int i14 = person2.getID();
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.getName();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nMatr\u00EDcula: -1\n"+ "'", str15.equals("Nome: \nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test491"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n", (int)(byte)10);
    person2.setID(0);
    person2.setID((int)'4');
    person2.setID(100);
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test492"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n", (-1));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test493"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", (int)'4');
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test494"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n", 10);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test495"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n", 35);
    int i3 = person2.getID();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test496"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", (int)'#');

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test497"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 10\n", (int)(byte)100);
    person2.setID(10);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test498"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", 100);
    person2.setID((int)(short)1);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test499"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9.test500"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));

  }

}
