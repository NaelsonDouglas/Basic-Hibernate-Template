
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    int i11 = student4.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 35);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.util.ArrayList<java.lang.String> arraylist_str12 = student4.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    boolean b9 = student4.addClass("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    boolean b7 = student4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    administrative.Departament departament11 = student4.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament11);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    int i9 = student4.getID();
    boolean b11 = student4.addClass("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    administrative.Departament departament8 = student4.getDepartment();
    java.util.ArrayList<java.lang.String> arraylist_str9 = student4.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.lang.String str12 = student4.reportIn();
    boolean b14 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    administrative.Departament departament15 = student4.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    int i12 = student4.getID();
    boolean b14 = student4.addClass("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    int i9 = student4.getID();
    administrative.Departament departament10 = null;
    student4.setDepartament(departament10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.lang.String str12 = student4.reportIn();
    student4.setID(0);
    java.util.ArrayList<java.lang.String> arraylist_str15 = student4.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str15);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.lang.String str12 = student4.reportIn();
    int i13 = student4.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    personal.Student student4 = new personal.Student("", (int)(short)10, false, 0);
    java.lang.String str5 = student4.getName();
    java.util.ArrayList<java.lang.String> arraylist_str6 = student4.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    int i12 = student4.getID();
    java.lang.String str13 = student4.reportIn();
    administrative.Departament departament14 = null;
    student4.setDepartament(departament14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str13.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    personal.Student student4 = new personal.Student("", (int)(short)10, false, 0);
    java.util.ArrayList<java.lang.String> arraylist_str5 = student4.getClasses();
    boolean b6 = student4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    boolean b8 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    java.util.ArrayList<java.lang.String> arraylist_str9 = student4.getClasses();
    int i10 = student4.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    int i9 = student4.getID();
    boolean b11 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    administrative.Course course12 = null;
    student4.setCourse(course12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    personal.Student student4 = new personal.Student("", (int)'a', false, 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    boolean b8 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    java.util.ArrayList<java.lang.String> arraylist_str9 = student4.getClasses();
    administrative.Course course10 = null;
    student4.setCourse(course10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    personal.Student student4 = new personal.Student("", (int)(short)10, false, 0);
    int i5 = student4.getID();
    student4.setID((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    administrative.Course course8 = null;
    student4.setCourse(course8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    student4.setID(0);
    java.util.ArrayList<java.lang.String> arraylist_str14 = student4.getClasses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    java.lang.String str9 = student4.reportIn();
    boolean b10 = student4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    java.lang.String str5 = student4.getName();
    boolean b7 = student4.addClass("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    boolean b8 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    java.lang.String str9 = student4.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\nNome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n\n\n"+ "'", str9.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\nNome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n\n\n"));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    boolean b12 = student4.addClass("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n");
    student4.setID((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    administrative.Departament departament5 = student4.getDepartment();
    boolean b6 = student4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.lang.String str12 = student4.reportIn();
    student4.setID(0);
    boolean b15 = student4.isPosGrad();
    java.lang.String str16 = student4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    personal.Student student4 = new personal.Student("hi!", 0, true, (int)'#');
    boolean b6 = student4.addClass("hi!");
    java.lang.String str7 = student4.getName();
    java.lang.String str8 = student4.reportIn();
    administrative.Departament departament9 = null;
    student4.setDepartament(departament9);
    java.util.ArrayList<java.lang.String> arraylist_str11 = student4.getClasses();
    java.lang.String str12 = student4.reportIn();
    student4.setID(0);
    administrative.Departament departament15 = null;
    student4.setDepartament(departament15);
    int i17 = student4.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str8.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"+ "'", str12.equals("Nome: hi!\nMatr\u00EDcula: -1\nCurso: \nDISCIPLINAS COM MATR\u00CCCULA:\nhi!\n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);

  }

}
