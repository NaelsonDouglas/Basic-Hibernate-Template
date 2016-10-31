
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test001"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", (int)'#');
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test002"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (-1));
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    person2.setID(1);
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((int)(byte)10);
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test003"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", (int)' ');
    person2.setID((int)(short)-1);
    person2.setID((-1));
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test004"); }


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
    java.lang.String str13 = person2.reportIn();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test005"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)(short)100);
    person2.setID((int)(byte)1);
    person2.setID((int)(byte)10);
    java.lang.String str13 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test006"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", (int)(short)1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test007"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", (int)(byte)100);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test008"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test009"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 35);
    int i3 = person2.getID();
    person2.setID((int)' ');
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test010"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n", (int)(byte)100);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test011"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    int i5 = person2.getID();
    person2.setID(97);
    int i8 = person2.getID();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test012"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(byte)100);
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test013"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)(short)1);
    person2.setID(52);
    int i5 = person2.getID();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test014"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", 32);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test015"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    person2.setID((int)'4');
    int i9 = person2.getID();
    int i10 = person2.getID();
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test016"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n", (int)'a');
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test017"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n", (int)'#');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test018"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(short)10);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    person2.setID((int)' ');
    person2.setID((-1));
    int i10 = person2.getID();
    person2.setID((int)(byte)10);
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"+ "'", str13.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test019"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    person2.setID(10);
    java.lang.String str12 = person2.reportIn();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test020"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 32\n", (int)(short)1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test021"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    person2.setID((int)'4');
    person2.setID((-1));
    java.lang.String str12 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test022"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(byte)0);
    person2.setID(32);
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test023"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.reportIn();
    java.lang.String str14 = person2.reportIn();
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.getName();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 52\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test024"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)(short)1);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test025"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n", (int)'a');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test026"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n", 52);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test027"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 35);
    person2.setID((int)(short)0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test028"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", (int)(byte)0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test029"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(35);
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((-1));
    java.lang.String str11 = person2.getName();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test030"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n", (int)(byte)0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test031"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", 97);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID((int)(short)1);
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test032"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", 32);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test033"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(byte)10);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test034"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(byte)-1);
    int i3 = person2.getID();
    person2.setID(52);
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test035"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    int i3 = person2.getID();
    person2.setID((int)(short)10);
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    person2.setID((int)(short)10);
    java.lang.String str10 = person2.reportIn();
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str10.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test036"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)10);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    person2.setID((int)(byte)100);
    int i11 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test037"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test038"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test039"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n", (int)(byte)-1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test040"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", 10);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test041"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test042"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)-1);
    person2.setID((int)'4');
    person2.setID((int)'4');
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test043"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (-1));
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)(short)100);
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test044"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", (int)(short)10);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test045"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 32\n", (int)(short)0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test046"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test047"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n", (int)(short)10);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test048"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n", 10);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test049"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)100);
    int i3 = person2.getID();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test050"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)(short)1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test051"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", 10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test052"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (int)(byte)10);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test053"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    person2.setID((int)' ');
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)(byte)1);
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test054"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    person2.setID((int)(byte)1);
    java.lang.String str5 = person2.getName();
    person2.setID((int)(short)100);
    int i8 = person2.getID();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test055"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", 35);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test056"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test057"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n", (int)(byte)10);
    person2.setID(35);
    person2.setID((-1));
    java.lang.String str7 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test058"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    person2.setID((int)(short)1);
    person2.setID(0);
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    int i11 = person2.getID();
    int i12 = person2.getID();
    java.lang.String str13 = person2.getName();
    person2.setID((int)(short)0);
    java.lang.String str16 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test059"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n", (int)'4');

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test060"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 35\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    person2.setID((int)(short)1);
    java.lang.String str7 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test061"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n", 1);
    person2.setID((int)(short)10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test062"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    int i9 = person2.getID();
    person2.setID(35);
    
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
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test063"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", (int)'#');
    java.lang.String str3 = person2.getName();
    person2.setID((-1));
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test064"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.getName();
    person2.setID(0);
    person2.setID((int)(short)0);
    int i12 = person2.getID();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    person2.setID((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test065"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    person2.setID((int)'#');
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    person2.setID(1);
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test066"); }


    personal.Person person2 = new personal.Person("", 52);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test067"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 10\n", (-1));
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test068"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID((int)(short)10);
    java.lang.String str11 = person2.reportIn();
    person2.setID((int)' ');
    java.lang.String str14 = person2.reportIn();
    int i15 = person2.getID();
    int i16 = person2.getID();
    person2.setID((int)' ');
    person2.setID(32);
    int i21 = person2.getID();
    int i22 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: \nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str14.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test069"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", 32);
    person2.setID(1);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test070"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", (int)(byte)100);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test071"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n", 97);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test072"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(byte)100);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test073"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(byte)10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test074"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    int i13 = person2.getID();
    
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
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test075"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    person2.setID((int)(byte)0);
    person2.setID((-1));
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test076"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    java.lang.String str14 = person2.getName();
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test077"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n", (int)(short)-1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test078"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)'4');

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test079"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    int i9 = person2.getID();
    person2.setID(1);
    person2.setID((int)(short)1);
    java.lang.String str14 = person2.getName();
    java.lang.String str15 = person2.getName();
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test080"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", 52);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test081"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 97);
    person2.setID((int)(byte)0);
    java.lang.String str5 = person2.reportIn();
    person2.setID(0);
    person2.setID((int)(short)10);
    java.lang.String str10 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test082"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)(byte)-1);
    person2.setID((int)(short)10);
    person2.setID((int)(short)1);
    person2.setID((-1));
    int i9 = person2.getID();
    int i10 = person2.getID();
    person2.setID((int)(byte)-1);
    int i13 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test083"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID((int)(byte)0);
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test084"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n", 0);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    person2.setID(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test085"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (int)(byte)100);
    java.lang.String str3 = person2.reportIn();
    person2.setID((-1));
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test086"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n", 32);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    person2.setID((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test087"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", 10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test088"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)(byte)100);
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    person2.setID(10);
    person2.setID((int)'#');
    
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
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test089"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n", 32);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test090"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test091"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    person2.setID(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test092"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test093"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)100);
    person2.setID((int)' ');
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 32\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test094"); }


    personal.Person person2 = new personal.Person("", (int)(short)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.reportIn();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test095"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 1\n", (int)(short)100);
    person2.setID(97);
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test096"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(0);
    java.lang.String str7 = person2.reportIn();
    person2.setID((-1));
    int i10 = person2.getID();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test097"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n", (int)(byte)-1);
    person2.setID((int)(byte)0);
    person2.setID(10);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test098"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 10\n", (int)'a');
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test099"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n", (int)(short)10);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test100"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n", 100);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test101"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n", 32);
    int i3 = person2.getID();
    person2.setID(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test102"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test103"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (-1));
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    person2.setID(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test104"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 100);
    person2.setID((int)(short)-1);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test105"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n", (int)(short)1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test106"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n", (int)' ');
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test107"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", 52);
    person2.setID(0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test108"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)0);
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test109"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n", 97);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID((-1));
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test110"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 97\n", (-1));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test111"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n", 52);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test112"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 10\n", (int)(byte)10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test113"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    person2.setID((int)(short)100);
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    person2.setID((int)(short)10);
    person2.setID((int)(byte)10);
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test114"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(short)-1);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)10);
    person2.setID((-1));
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.getName();
    person2.setID((int)'#');
    java.lang.String str12 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str12.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test115"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", (int)(byte)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test116"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test117"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    int i9 = person2.getID();
    int i10 = person2.getID();
    int i11 = person2.getID();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    java.lang.String str15 = person2.getName();
    java.lang.String str16 = person2.getName();
    java.lang.String str17 = person2.getName();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str15.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str17.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test118"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n", (int)(short)-1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test119"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID(1);
    int i11 = person2.getID();
    person2.setID(1);
    java.lang.String str14 = person2.reportIn();
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str14.equals("Nome: \nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str15.equals("Nome: \nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str16.equals("Nome: \nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test120"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", 10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test121"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)10);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test122"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(short)1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test123"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (int)(short)10);
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)'#');
    person2.setID((int)(short)1);
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(byte)-1);
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str9.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str12.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str13.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test124"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n", (int)(byte)10);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test125"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n", (int)(byte)1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test126"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test127"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", 32);
    int i3 = person2.getID();
    int i4 = person2.getID();
    int i5 = person2.getID();
    person2.setID(1);
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"+ "'", str10.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test128"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n", (int)(short)10);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test129"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    int i8 = person2.getID();
    java.lang.String str9 = person2.getName();
    person2.setID(1);
    int i12 = person2.getID();
    person2.setID(32);
    person2.setID(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test130"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test131"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n", (int)(byte)-1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test132"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    person2.setID(32);
    person2.setID((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test133"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    person2.setID(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test134"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", (int)(byte)0);
    person2.setID((int)(short)-1);
    person2.setID(97);
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test135"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    person2.setID((int)'#');
    person2.setID(52);
    person2.setID(10);
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    int i12 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 10\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test136"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 35\n", 0);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test137"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test138"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", 10);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    person2.setID((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test139"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", (int)'#');
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test140"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((int)(byte)10);
    person2.setID(10);
    java.lang.String str13 = person2.getName();
    person2.setID(35);
    java.lang.String str16 = person2.getName();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test141"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 32\n", (int)' ');
    person2.setID(0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test142"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", (int)'#');
    person2.setID((int)(short)0);
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test143"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n", (int)(byte)10);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test144"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", (int)'a');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test145"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (-1));
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID(1);
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test146"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    person2.setID((int)(byte)10);
    java.lang.String str11 = person2.getName();
    int i12 = person2.getID();
    int i13 = person2.getID();
    java.lang.String str14 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str14.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test147"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID((-1));
    int i9 = person2.getID();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test148"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n", (int)(byte)10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test149"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n", (int)(short)-1);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test150"); }


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
    int i14 = person2.getID();
    int i15 = person2.getID();
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test151"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.reportIn();
    person2.setID(52);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.getName();
    person2.setID(32);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test152"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 100);
    int i3 = person2.getID();
    person2.setID((int)(byte)1);
    person2.setID((int)' ');
    person2.setID((-1));
    person2.setID((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test153"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n", 52);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID(1);
    java.lang.String str9 = person2.getName();
    person2.setID(1);
    person2.setID((int)(byte)1);
    person2.setID((int)(byte)10);
    
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

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test154"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", 0);
    person2.setID((int)(byte)10);
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test155"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", (int)(byte)10);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test156"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: -1\n", 97);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test157"); }


    personal.Person person2 = new personal.Person("", (int)(byte)10);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    person2.setID(32);
    person2.setID((int)(short)-1);
    person2.setID((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test158"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    person2.setID(52);
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.reportIn();
    int i11 = person2.getID();
    person2.setID((int)' ');
    java.lang.String str14 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"+ "'", str10.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"+ "'", str14.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test159"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    person2.setID((int)(byte)10);
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: \nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nMatr\u00EDcula: 10\n"+ "'", str13.equals("Nome: \nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test160"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 35\n", 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test161"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n", 0);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test162"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    int i3 = person2.getID();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str6.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test163"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID(32);
    int i9 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test164"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n", 32);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test165"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n", (-1));
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test166"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)(byte)1);
    person2.setID((-1));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test167"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 35\n", (int)'#');
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 35);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test168"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 52\n", (int)(short)100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test169"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.getName();
    person2.setID((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test170"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n", 100);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)10);
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.reportIn();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str7.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str8.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"+ "'", str9.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test171"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", 100);
    person2.setID(10);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test172"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 32\n", 100);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test173"); }


    personal.Person person2 = new personal.Person("", (int)(short)0);
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.getName();
    person2.setID(35);
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test174"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 100\n", 32);
    int i3 = person2.getID();
    int i4 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test175"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", 10);
    java.lang.String str3 = person2.getName();
    person2.setID(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test176"); }


    personal.Person person2 = new personal.Person("hi!", (int)(byte)1);
    person2.setID((int)(byte)1);
    person2.setID(52);
    person2.setID((int)(short)0);
    person2.setID(100);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test177"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", 97);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test178"); }


    personal.Person person2 = new personal.Person("", 0);
    person2.setID((int)' ');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'4');
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test179"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 97);
    java.lang.String str3 = person2.getName();
    person2.setID((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test180"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test181"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n", (int)'4');

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test182"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)'4');
    java.lang.String str3 = person2.reportIn();
    person2.setID((int)(byte)0);
    java.lang.String str6 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test183"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n", 0);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test184"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test185"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n", (int)(short)1);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test186"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n", 10);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test187"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 100\n", (int)(byte)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    int i5 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test188"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", (int)(byte)-1);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test189"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    person2.setID(0);
    java.lang.String str7 = person2.getName();
    person2.setID((-1));
    person2.setID((int)'#');
    java.lang.String str12 = person2.getName();
    int i13 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str16 = person2.getName();
    java.lang.String str17 = person2.reportIn();
    person2.setID((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str7.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str17.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test190"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n", 0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test191"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)'4');
    person2.setID(52);
    person2.setID((int)(short)100);
    person2.setID(1);
    int i14 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test192"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    java.lang.String str10 = person2.getName();
    java.lang.String str11 = person2.getName();
    java.lang.String str12 = person2.getName();
    java.lang.String str13 = person2.reportIn();
    int i14 = person2.getID();
    int i15 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str6.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test193"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.reportIn();
    person2.setID(0);
    java.lang.String str8 = person2.reportIn();
    int i9 = person2.getID();
    java.lang.String str10 = person2.reportIn();
    java.lang.String str11 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: \nMatr\u00EDcula: 97\n"+ "'", str5.equals("Nome: \nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str8.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nMatr\u00EDcula: 0\n"+ "'", str10.equals("Nome: \nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test194"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n", (int)'a');
    java.lang.String str3 = person2.reportIn();
    person2.setID(1);
    int i6 = person2.getID();
    person2.setID((int)'4');
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test195"); }


    personal.Person person2 = new personal.Person("hi!", (int)'a');
    java.lang.String str3 = person2.getName();
    int i4 = person2.getID();
    person2.setID(35);
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    person2.setID((-1));
    java.lang.String str11 = person2.reportIn();
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.getName();
    java.lang.String str14 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 35\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str11.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test196"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 0\n", 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test197"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 52\n", (int)' ');

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test198"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n", (int)(byte)-1);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    person2.setID(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test199"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    person2.setID(10);
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"+ "'", str8.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test200"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    java.lang.String str7 = person2.reportIn();
    person2.setID((int)(byte)100);
    int i10 = person2.getID();
    java.lang.String str11 = person2.reportIn();
    person2.setID(10);
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
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str11.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str14.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test201"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    person2.setID((int)'a');
    java.lang.String str5 = person2.getName();
    person2.setID((int)'a');
    java.lang.String str8 = person2.getName();
    person2.setID(1);
    person2.setID((int)(short)-1);
    person2.setID(1);
    java.lang.String str15 = person2.reportIn();
    java.lang.String str16 = person2.getName();
    java.lang.String str17 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str15.equals("Nome: \nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str17.equals("Nome: \nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test202"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n", (-1));
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test203"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: -1\n", 52);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test204"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 35\n", 32);
    int i3 = person2.getID();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    int i8 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str4.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 32\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str6.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: \nMatr\u00EDcula: 35\n"+ "'", str7.equals("Nome: \nMatr\u00EDcula: 35\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test205"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", 100);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.reportIn();
    java.lang.String str7 = person2.getName();
    person2.setID((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str4.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test206"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n", (int)'#');
    person2.setID((int)' ');
    person2.setID(35);
    person2.setID(0);
    java.lang.String str9 = person2.getName();
    java.lang.String str10 = person2.getName();
    person2.setID((int)(short)-1);
    java.lang.String str13 = person2.getName();
    java.lang.String str14 = person2.reportIn();
    java.lang.String str15 = person2.getName();
    java.lang.String str16 = person2.getName();
    person2.setID((int)(short)0);
    int i19 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str9.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str13.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"+ "'", str14.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str15.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"+ "'", str16.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test207"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n", 32);
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test208"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n", 35);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test209"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 10\n", (int)(short)10);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test210"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n", 0);
    java.lang.String str3 = person2.reportIn();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    java.lang.String str7 = person2.getName();
    java.lang.String str8 = person2.getName();
    java.lang.String str9 = person2.getName();
    person2.setID((int)(short)-1);
    int i12 = person2.getID();
    person2.setID((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str7.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test211"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 1\n", (int)'4');

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test212"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n", (int)(byte)-1);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"+ "'", str4.equals("Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test213"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 1\n", (int)(byte)100);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: \nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: \nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test214"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    int i6 = person2.getID();
    person2.setID((int)(byte)100);
    int i9 = person2.getID();
    person2.setID(1);
    java.lang.String str12 = person2.reportIn();
    java.lang.String str13 = person2.getName();
    java.lang.String str14 = person2.reportIn();
    person2.setID((int)'4');
    person2.setID((int)(short)100);
    int i19 = person2.getID();
    int i20 = person2.getID();
    int i21 = person2.getID();
    person2.setID(97);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 0\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"+ "'", str14.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test215"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)-1);
    person2.setID((int)(byte)10);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str5.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test216"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n", 52);
    person2.setID(0);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 52\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test217"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n", (int)(short)100);
    java.lang.String str3 = person2.getName();
    person2.setID((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 35\n"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test218"); }


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
    int i14 = person2.getID();
    int i15 = person2.getID();
    java.lang.String str16 = person2.reportIn();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Nome: hi!\nMatr\u00EDcula: 1\n"+ "'", str16.equals("Nome: hi!\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test219"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: -1\n", (-1));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test220"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n", 97);
    int i3 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 97);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test221"); }


    personal.Person person2 = new personal.Person("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n", 100);
    java.lang.String str3 = person2.reportIn();
    int i4 = person2.getID();
    java.lang.String str5 = person2.reportIn();
    java.lang.String str6 = person2.reportIn();
    int i7 = person2.getID();
    java.lang.String str8 = person2.reportIn();
    java.lang.String str9 = person2.reportIn();
    person2.setID(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str5.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str6.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str8.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"+ "'", str9.equals("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test222"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n", (int)(byte)1);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 1\n"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test223"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 100\n", (int)(byte)10);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test224"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    java.lang.String str6 = person2.getName();
    person2.setID((int)'4');
    java.lang.String str9 = person2.reportIn();
    int i10 = person2.getID();
    person2.setID((int)(short)1);
    java.lang.String str13 = person2.getName();
    int i14 = person2.getID();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test225"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n", (int)' ');
    java.lang.String str3 = person2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"+ "'", str3.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: -1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 97\n"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test226"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: Nome: Nome: Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 97\n", (int)(byte)10);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test227"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 100\n", 32);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test228"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", 0);
    int i3 = person2.getID();
    java.lang.String str4 = person2.reportIn();
    int i5 = person2.getID();
    person2.setID((int)(short)1);
    person2.setID((int)(byte)0);
    person2.setID((int)(short)10);
    java.lang.String str12 = person2.reportIn();
    person2.setID(100);
    person2.setID((int)'4');
    int i17 = person2.getID();
    int i18 = person2.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"+ "'", str4.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"+ "'", str12.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 10\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test229"); }


    personal.Person person2 = new personal.Person("Nome: hi!\nMatr\u00EDcula: 0\n", (int)(byte)1);
    person2.setID((int)(short)100);
    int i5 = person2.getID();
    java.lang.String str6 = person2.getName();
    int i7 = person2.getID();
    java.lang.String str8 = person2.getName();
    int i9 = person2.getID();
    java.lang.String str10 = person2.reportIn();
    person2.setID(32);
    int i13 = person2.getID();
    int i14 = person2.getID();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"+ "'", str10.equals("Nome: Nome: hi!\nMatr\u00EDcula: 0\n\nMatr\u00EDcula: 100\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test230"); }


    personal.Person person2 = new personal.Person("hi!", (int)(short)0);
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.getName();
    int i6 = person2.getID();
    int i7 = person2.getID();
    person2.setID((int)(byte)-1);
    person2.setID(100);
    int i12 = person2.getID();
    person2.setID((int)(byte)100);
    
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

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test231"); }


    personal.Person person2 = new personal.Person("Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n", (int)'4');
    person2.setID((int)(short)0);
    java.lang.String str5 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"+ "'", str5.equals("Nome: Nome: Nome: Nome: hi!\nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 32\n\nMatr\u00EDcula: 52\n\nMatr\u00EDcula: 0\n"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test232"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 97\n", (-1));
    person2.setID((int)(short)-1);
    java.lang.String str5 = person2.reportIn();
    person2.setID((int)'4');
    java.lang.String str8 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: -1\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"+ "'", str8.equals("Nome: Nome: \nMatr\u00EDcula: 97\n\nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test233"); }


    personal.Person person2 = new personal.Person("", (int)'4');
    java.lang.String str3 = person2.getName();
    java.lang.String str4 = person2.getName();
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    int i7 = person2.getID();
    int i8 = person2.getID();
    java.lang.String str9 = person2.reportIn();
    person2.setID((int)(short)-1);
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nMatr\u00EDcula: 52\n"+ "'", str9.equals("Nome: \nMatr\u00EDcula: 52\n"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test234"); }


    personal.Person person2 = new personal.Person("Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n", (int)(short)100);
    java.lang.String str3 = person2.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nome: Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"+ "'", str3.equals("Nome: Nome: Nome: \nMatr\u00EDcula: 1\n\nMatr\u00EDcula: 10\n\nMatr\u00EDcula: 100\n"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22.test235"); }


    personal.Person person2 = new personal.Person("Nome: \nMatr\u00EDcula: 100\n", (int)'a');
    person2.setID((int)'4');
    java.lang.String str5 = person2.reportIn();
    int i6 = person2.getID();
    person2.setID((int)(byte)-1);
    person2.setID((int)(short)10);
    person2.setID((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"+ "'", str5.equals("Nome: Nome: \nMatr\u00EDcula: 100\n\nMatr\u00EDcula: 52\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

}
