
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    java.lang.String str6 = secretary4.toString();
    // The following exception was thrown during execution in test generation
    try {
    administrative.Course course8 = secretary4.pickCourse((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    administrative.Departament departament7 = null;
    secretary4.setDepartment(departament7);
    java.lang.String str9 = secretary4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    administrative.Departament departament6 = secretary4.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    administrative.Departament departament6 = null;
    secretary4.setDepartment(departament6);
    administrative.Departament departament8 = secretary4.getDepartment();
    java.lang.String str9 = secretary4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    java.lang.String str6 = secretary4.toString();
    // The following exception was thrown during execution in test generation
    try {
    administrative.Course course8 = secretary4.pickCourse((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    administrative.Departament departament5 = secretary4.getDepartment();
    java.util.ArrayList<administrative.Course> arraylist_course6 = secretary4.getCourses();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    boolean b6 = secretary4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    administrative.Departament departament7 = null;
    secretary4.setDepartment(departament7);
    administrative.Departament departament9 = null;
    secretary4.setDepartment(departament9);
    administrative.Departament departament11 = null;
    secretary4.setDepartment(departament11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    java.util.ArrayList<administrative.Course> arraylist_course2 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array3 = new administrative.Course[] {  };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course2, course_array3);
    administrative.Secretary secretary5 = new administrative.Secretary(true, arraylist_course2);
    administrative.Secretary secretary6 = new administrative.Secretary(true, arraylist_course2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    administrative.Departament departament5 = null;
    secretary4.setDepartment(departament5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    secretary4.setPosGrad(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    administrative.Departament departament5 = secretary4.getDepartment();
    java.util.ArrayList<personal.Student> arraylist_student6 = secretary4.getStudents();
    administrative.Departament departament7 = secretary4.getDepartment();
    java.util.ArrayList<personal.Student> arraylist_student8 = secretary4.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    java.lang.String str7 = secretary4.toString();
    // The following exception was thrown during execution in test generation
    try {
    administrative.Course course9 = secretary4.pickCourse(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.util.ArrayList<personal.Student> arraylist_student6 = secretary4.getStudents();
    boolean b7 = secretary4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    administrative.Departament departament7 = null;
    secretary4.setDepartment(departament7);
    administrative.Departament departament9 = null;
    secretary4.setDepartment(departament9);
    administrative.Departament departament11 = secretary4.getDepartment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament11);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    administrative.Departament departament6 = null;
    secretary4.setDepartment(departament6);
    administrative.Departament departament8 = secretary4.getDepartment();
    secretary4.setPosGrad(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament8);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    java.lang.String str7 = secretary4.toString();
    // The following exception was thrown during execution in test generation
    try {
    administrative.Course course9 = secretary4.pickCourse((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    java.util.ArrayList<administrative.Course> arraylist_course2 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array3 = new administrative.Course[] {  };
    boolean b4 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course2, course_array3);
    administrative.Secretary secretary5 = new administrative.Secretary(true, arraylist_course2);
    administrative.Departament departament6 = secretary5.getDepartment();
    java.util.ArrayList<administrative.Course> arraylist_course8 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array9 = new administrative.Course[] {  };
    boolean b10 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course8, course_array9);
    administrative.Secretary secretary11 = new administrative.Secretary(true, arraylist_course8);
    java.util.ArrayList<administrative.Course> arraylist_course12 = secretary11.getCourses();
    secretary5.setCourses(arraylist_course12);
    administrative.Secretary secretary14 = new administrative.Secretary(true, arraylist_course12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course12);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    administrative.Departament departament5 = secretary4.getDepartment();
    java.util.ArrayList<personal.Student> arraylist_student6 = secretary4.getStudents();
    administrative.Departament departament7 = secretary4.getDepartment();
    java.lang.String str8 = secretary4.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    administrative.Departament departament6 = null;
    secretary4.setDepartment(departament6);
    administrative.Departament departament8 = secretary4.getDepartment();
    java.lang.String str9 = secretary4.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    java.util.ArrayList<administrative.Course> arraylist_course5 = secretary4.getCourses();
    administrative.Departament departament6 = null;
    secretary4.setDepartment(departament6);
    administrative.Departament departament8 = secretary4.getDepartment();
    administrative.Departament departament9 = secretary4.getDepartment();
    java.util.ArrayList<personal.Student> arraylist_student10 = secretary4.getStudents();
    boolean b11 = secretary4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_course5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(departament9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.ArrayList<administrative.Course> arraylist_course1 = new java.util.ArrayList<administrative.Course>();
    administrative.Course[] course_array2 = new administrative.Course[] {  };
    boolean b3 = java.util.Collections.addAll((java.util.Collection<administrative.Course>)arraylist_course1, course_array2);
    administrative.Secretary secretary4 = new administrative.Secretary(true, arraylist_course1);
    boolean b5 = secretary4.isPosGrad();
    java.lang.String str6 = secretary4.toString();
    java.lang.String str7 = secretary4.toString();
    boolean b8 = secretary4.isPosGrad();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(course_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
