
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.listRequisites();
    boolean b13 = class7.isAvailable();
    boolean b14 = class7.isAvailable();
    java.lang.String str15 = class7.getTeacher();
    java.lang.String str16 = class7.getID();
    boolean b17 = class7.isElective();
    int i18 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    int i62 = class37.getCredits();
    administrative.Class class70 = new administrative.Class("", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)0, true, false, (int)'#', "|| ");
    java.lang.String str71 = class70.getTeacher();
    boolean b72 = class37.addPreRequisite(class70);
    java.lang.String str73 = class37.getID();
    java.lang.String str74 = class37.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "|| "+ "'", str71.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + ""+ "'", str73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n| \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str74.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n| \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i18 = class17.getMinCredits();
    java.lang.String str19 = class17.reportIn();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b28 = class17.addPreRequisite(class27);
    java.lang.String str29 = class27.reportIn();
    boolean b30 = class7.addPreRequisite(class27);
    boolean b31 = class7.isElective();
    int i32 = class7.getCredits();
    java.lang.String str33 = class7.getName();
    administrative.Class class41 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class49 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i50 = class49.getMinCredits();
    java.lang.String str51 = class49.getName();
    java.lang.String str52 = class49.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student53 = class49.getStudents();
    boolean b54 = class41.addPreRequisite(class49);
    boolean b55 = class7.addPreRequisite(class41);
    java.lang.String str56 = class41.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "|"+ "'", str56.equals("|"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 1\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nC\u00F3digo: hi!\nCr\u00E9ditos: -1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n", (int)(short)10, false, false, (int)(short)-1, "|Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n| ");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class17.isElective();
    java.lang.String str20 = class17.reportIn();
    administrative.Class class28 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    boolean b29 = class17.addPreRequisite(class28);
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i38 = class37.getMinCredits();
    java.lang.String str39 = class37.reportIn();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b48 = class37.addPreRequisite(class47);
    java.lang.String str49 = class47.reportIn();
    java.lang.String str50 = class47.getID();
    boolean b51 = class47.isElective();
    java.lang.String str52 = class47.toString();
    boolean b53 = class28.addPreRequisite(class47);
    boolean b54 = class28.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str52.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getName();
    java.lang.String str13 = class7.getName();
    java.lang.String str14 = class7.toString();
    administrative.Course course15 = null;
    class7.setCourse(course15);
    java.util.ArrayList<personal.Student> arraylist_student17 = class7.getStudents();
    java.lang.String str18 = class7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str14.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)10, true, false, (int)' ', "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.getID();
    boolean b9 = class7.isElective();
    java.lang.String str10 = class7.getTeacher();
    administrative.Course course11 = null;
    class7.setCourse(course11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    java.lang.String str10 = class7.getName();
    java.lang.String str11 = class7.getID();
    java.lang.String str12 = class7.getTeacher();
    int i13 = class7.getCredits();
    administrative.Class class21 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i22 = class21.getMinCredits();
    java.lang.String str23 = class21.reportIn();
    administrative.Class class31 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b32 = class21.addPreRequisite(class31);
    boolean b33 = class21.isAvailable();
    java.lang.String str34 = class21.getID();
    java.lang.String str35 = class21.getName();
    java.lang.String str36 = class21.getName();
    boolean b37 = class21.isAvailable();
    boolean b38 = class7.addPreRequisite(class21);
    administrative.Class class46 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str47 = class46.listRequisites();
    java.lang.String str48 = class46.getTeacher();
    administrative.Course course49 = null;
    class46.setCourse(course49);
    int i51 = class46.getCredits();
    java.lang.String str52 = class46.listRequisites();
    boolean b53 = class46.isAvailable();
    boolean b54 = class46.isElective();
    boolean b55 = class46.isAvailable();
    boolean b56 = class7.addPreRequisite(class46);
    boolean b57 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "|"+ "'", str47.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + ""+ "'", str48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "|"+ "'", str52.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.reportIn();
    int i11 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    java.lang.String str31 = class7.getName();
    java.lang.String str32 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    java.lang.String str23 = class17.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student24 = class17.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student25 = class17.getStudents();
    java.lang.String str26 = class17.toString();
    boolean b27 = class17.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str26.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str8 = class7.toString();
    java.util.ArrayList<personal.Student> arraylist_student9 = class7.getStudents();
    boolean b10 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class7.getName();
    java.lang.String str20 = class7.listRequisites();
    java.lang.String str21 = class7.listRequisites();
    int i22 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "|| "+ "'", str20.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "|| "+ "'", str21.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    boolean b32 = class29.isElective();
    java.lang.String str33 = class29.toString();
    java.lang.String str34 = class29.toString();
    java.util.ArrayList<personal.Student> arraylist_student35 = class29.getStudents();
    java.lang.String str36 = class29.getName();
    boolean b37 = class29.isAvailable();
    int i38 = class29.getMinCredits();
    java.lang.String str39 = class29.toString();
    java.util.ArrayList<personal.Student> arraylist_student40 = class29.getStudents();
    boolean b41 = class29.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str33.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str34.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str39.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    boolean b12 = class7.isAvailable();
    java.lang.String str13 = class7.listRequisites();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "|"+ "'", str13.equals("|"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.listRequisites();
    int i10 = class7.getCredits();
    java.lang.String str11 = class7.reportIn();
    java.lang.String str12 = class7.reportIn();
    java.lang.String str13 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str13.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }


    administrative.Class class7 = new administrative.Class("", "", (int)'4', false, true, (int)(short)-1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    administrative.Class class25 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i26 = class25.getMinCredits();
    java.lang.String str27 = class25.reportIn();
    administrative.Class class35 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b36 = class25.addPreRequisite(class35);
    java.lang.String str37 = class35.reportIn();
    boolean b38 = class15.addPreRequisite(class35);
    boolean b39 = class15.isElective();
    boolean b40 = class15.isAvailable();
    administrative.Class class48 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class56 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i57 = class56.getMinCredits();
    java.lang.String str58 = class56.getName();
    java.lang.String str59 = class56.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student60 = class56.getStudents();
    boolean b61 = class48.addPreRequisite(class56);
    java.lang.String str62 = class56.getID();
    java.lang.String str63 = class56.listRequisites();
    administrative.Class class71 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class79 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i80 = class79.getMinCredits();
    java.lang.String str81 = class79.getName();
    java.lang.String str82 = class79.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student83 = class79.getStudents();
    boolean b84 = class71.addPreRequisite(class79);
    java.lang.String str85 = class79.getID();
    boolean b86 = class56.addPreRequisite(class79);
    int i87 = class56.getCredits();
    boolean b88 = class15.addPreRequisite(class56);
    boolean b89 = class7.addPreRequisite(class15);
    boolean b90 = class15.isAvailable();
    java.lang.String str91 = class15.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "|"+ "'", str63.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + ""+ "'", str81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + ""+ "'", str82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + ""+ "'", str91.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    administrative.Class class16 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i17 = class16.getMinCredits();
    java.lang.String str18 = class16.reportIn();
    administrative.Class class26 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b27 = class16.addPreRequisite(class26);
    java.lang.String str28 = class26.listRequisites();
    administrative.Class class36 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i37 = class36.getMinCredits();
    java.lang.String str38 = class36.reportIn();
    administrative.Class class46 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b47 = class36.addPreRequisite(class46);
    java.lang.String str48 = class46.listRequisites();
    administrative.Class class56 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i57 = class56.getMinCredits();
    java.lang.String str58 = class56.reportIn();
    administrative.Class class66 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b67 = class56.addPreRequisite(class66);
    boolean b68 = class46.addPreRequisite(class66);
    java.lang.String str69 = class46.getTeacher();
    boolean b70 = class26.addPreRequisite(class46);
    boolean b71 = class46.isElective();
    int i72 = class46.getMinCredits();
    int i73 = class46.getCredits();
    java.lang.String str74 = class46.reportIn();
    boolean b75 = class7.addPreRequisite(class46);
    administrative.Course course76 = null;
    class7.setCourse(course76);
    java.lang.String str78 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "|"+ "'", str28.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "|"+ "'", str48.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + ""+ "'", str74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ""+ "'", str78.equals(""));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    administrative.Course course9 = null;
    class7.setCourse(course9);
    boolean b11 = class7.isElective();
    boolean b12 = class7.isElective();
    int i13 = class7.getCredits();
    administrative.Class class21 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    java.lang.String str31 = class29.getName();
    java.lang.String str32 = class29.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student33 = class29.getStudents();
    boolean b34 = class21.addPreRequisite(class29);
    java.lang.String str35 = class21.listRequisites();
    boolean b36 = class7.addPreRequisite(class21);
    int i37 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "|| "+ "'", str35.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getID();
    administrative.Class class17 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    int i18 = class17.getMinCredits();
    int i19 = class17.getCredits();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str30 = class29.listRequisites();
    java.lang.String str31 = class29.getTeacher();
    administrative.Course course32 = null;
    class29.setCourse(course32);
    java.lang.String str34 = class29.reportIn();
    boolean b35 = class29.isElective();
    java.lang.String str36 = class29.getTeacher();
    boolean b37 = class17.addPreRequisite(class29);
    boolean b38 = class7.addPreRequisite(class29);
    boolean b39 = class29.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "|"+ "'", str30.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    boolean b62 = class37.isElective();
    int i63 = class37.getMinCredits();
    administrative.Course course64 = null;
    class37.setCourse(course64);
    int i66 = class37.getMinCredits();
    java.lang.String str67 = class37.getTeacher();
    boolean b68 = class37.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + ""+ "'", str67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    boolean b62 = class37.isElective();
    int i63 = class37.getMinCredits();
    administrative.Course course64 = null;
    class37.setCourse(course64);
    java.lang.String str66 = class37.listRequisites();
    administrative.Class class74 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class82 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i83 = class82.getMinCredits();
    java.lang.String str84 = class82.getName();
    java.lang.String str85 = class82.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student86 = class82.getStudents();
    boolean b87 = class74.addPreRequisite(class82);
    java.lang.String str88 = class74.getTeacher();
    boolean b89 = class37.addPreRequisite(class74);
    java.lang.String str90 = class74.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "|| "+ "'", str66.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + ""+ "'", str84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str88.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "|"+ "'", str90.equals("|"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    java.lang.String str23 = class17.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student24 = class17.getStudents();
    java.lang.String str25 = class17.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student26 = class17.getStudents();
    java.lang.String str27 = class17.listRequisites();
    boolean b28 = class17.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "|"+ "'", str27.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }


    administrative.Class class7 = new administrative.Class("hi!", "", (int)(byte)10, false, true, 32, "");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str16 = class15.listRequisites();
    java.lang.String str17 = class15.getTeacher();
    administrative.Course course18 = null;
    class15.setCourse(course18);
    java.lang.String str20 = class15.reportIn();
    java.lang.String str21 = class15.listRequisites();
    boolean b22 = class7.addPreRequisite(class15);
    java.lang.String str23 = class7.getName();
    int i24 = class7.getCredits();
    java.lang.String str25 = class7.getID();
    java.lang.String str26 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "|"+ "'", str16.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "|"+ "'", str21.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str26.equals("Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    administrative.Course course9 = null;
    class7.setCourse(course9);
    java.lang.String str11 = class7.getTeacher();
    java.lang.String str12 = class7.getTeacher();
    java.lang.String str13 = class7.reportIn();
    java.lang.String str14 = class7.getID();
    administrative.Course course15 = null;
    class7.setCourse(course15);
    java.lang.String str17 = class7.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.listRequisites();
    int i10 = class7.getCredits();
    java.lang.String str11 = class7.reportIn();
    java.lang.String str12 = class7.reportIn();
    boolean b13 = class7.isAvailable();
    int i14 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    java.lang.String str20 = class7.getID();
    boolean b21 = class7.isAvailable();
    int i22 = class7.getMinCredits();
    java.lang.String str23 = class7.toString();
    boolean b24 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str23.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | | \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 0\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | | \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "|Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n| ", 97, false, false, (int)' ', "|| ");
    int i8 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    int i32 = class29.getMinCredits();
    java.lang.String str33 = class29.getTeacher();
    java.lang.String str34 = class29.getName();
    java.lang.String str35 = class29.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    int i62 = class37.getCredits();
    administrative.Class class70 = new administrative.Class("", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)0, true, false, (int)'#', "|| ");
    java.lang.String str71 = class70.getTeacher();
    boolean b72 = class37.addPreRequisite(class70);
    administrative.Course course73 = null;
    class70.setCourse(course73);
    java.lang.String str75 = class70.getID();
    java.lang.String str76 = class70.getID();
    boolean b77 = class70.isElective();
    java.util.ArrayList<personal.Student> arraylist_student78 = class70.getStudents();
    boolean b79 = class70.isAvailable();
    java.lang.String str80 = class70.getName();
    java.lang.String str81 = class70.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "|| "+ "'", str71.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str75.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str76.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + ""+ "'", str81.equals(""));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "|| ", (int)(short)10, true, true, (int)(short)10, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.reportIn();
    boolean b9 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", "Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", (int)'#', false, false, (int)(short)100, "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    java.lang.String str11 = class7.getName();
    int i12 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"+ "'", str11.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 35);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.getTeacher();
    java.lang.String str9 = class7.getName();
    personal.Student student10 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b11 = class7.enroll(student10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    boolean b39 = class17.addPreRequisite(class37);
    java.lang.String str40 = class17.getTeacher();
    java.lang.String str41 = class17.listRequisites();
    java.lang.String str42 = class17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "|| "+ "'", str41.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str42.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    int i32 = class29.getMinCredits();
    java.lang.String str33 = class29.listRequisites();
    java.lang.String str34 = class29.listRequisites();
    java.util.ArrayList<personal.Student> arraylist_student35 = class29.getStudents();
    java.lang.String str36 = class29.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "|"+ "'", str33.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "|"+ "'", str34.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    int i23 = class17.getCredits();
    int i24 = class17.getMinCredits();
    java.lang.String str25 = class17.getTeacher();
    java.lang.String str26 = class17.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    java.lang.String str23 = class17.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student24 = class17.getStudents();
    java.lang.String str25 = class17.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student26 = class17.getStudents();
    java.lang.String str27 = class17.listRequisites();
    java.lang.String str28 = class17.listRequisites();
    java.lang.String str29 = class17.getName();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str38 = class37.listRequisites();
    java.lang.String str39 = class37.getTeacher();
    administrative.Course course40 = null;
    class37.setCourse(course40);
    java.lang.String str42 = class37.listRequisites();
    boolean b43 = class37.isAvailable();
    boolean b44 = class37.isAvailable();
    java.lang.String str45 = class37.getTeacher();
    boolean b46 = class17.addPreRequisite(class37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "|"+ "'", str27.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "|"+ "'", str28.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "|"+ "'", str38.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "|"+ "'", str42.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getName();
    administrative.Course course13 = null;
    class7.setCourse(course13);
    administrative.Class class22 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i23 = class22.getMinCredits();
    java.lang.String str24 = class22.reportIn();
    administrative.Class class32 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b33 = class22.addPreRequisite(class32);
    boolean b34 = class22.isAvailable();
    administrative.Class class42 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student43 = class42.getStudents();
    java.lang.String str44 = class42.getID();
    boolean b45 = class22.addPreRequisite(class42);
    int i46 = class22.getCredits();
    java.lang.String str47 = class22.getID();
    boolean b48 = class7.addPreRequisite(class22);
    java.util.ArrayList<personal.Student> arraylist_student49 = class22.getStudents();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str58 = class57.listRequisites();
    java.lang.String str59 = class57.getTeacher();
    administrative.Course course60 = null;
    class57.setCourse(course60);
    int i62 = class57.getCredits();
    java.lang.String str63 = class57.getName();
    int i64 = class57.getMinCredits();
    boolean b65 = class57.isElective();
    boolean b66 = class22.addPreRequisite(class57);
    int i67 = class57.getCredits();
    java.lang.String str68 = class57.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "|"+ "'", str58.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + ""+ "'", str68.equals(""));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    boolean b62 = class37.isElective();
    int i63 = class37.getMinCredits();
    int i64 = class37.getCredits();
    boolean b65 = class37.isAvailable();
    java.lang.String str66 = class37.listRequisites();
    administrative.Class class74 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i75 = class74.getMinCredits();
    boolean b76 = class74.isAvailable();
    java.lang.String str77 = class74.getName();
    java.util.ArrayList<personal.Student> arraylist_student78 = class74.getStudents();
    boolean b79 = class37.addPreRequisite(class74);
    boolean b80 = class74.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "|| "+ "'", str66.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + ""+ "'", str77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)(byte)10, false, false, (int)'4', "|| ");
    boolean b8 = class7.isElective();
    boolean b9 = class7.isElective();
    java.lang.String str10 = class7.listRequisites();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    administrative.Course course23 = null;
    class17.setCourse(course23);
    boolean b25 = class17.isElective();
    boolean b26 = class17.isElective();
    java.lang.String str27 = class17.toString();
    administrative.Class class35 = new administrative.Class("Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 35\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "|| | | ", 0, false, false, 0, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    boolean b36 = class17.addPreRequisite(class35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str27.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    boolean b32 = class29.isElective();
    java.lang.String str33 = class29.toString();
    java.lang.String str34 = class29.getTeacher();
    int i35 = class29.getCredits();
    java.lang.String str36 = class29.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str33.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.listRequisites();
    administrative.Class class20 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i21 = class20.getMinCredits();
    boolean b22 = class20.isAvailable();
    administrative.Course course23 = null;
    class20.setCourse(course23);
    boolean b25 = class7.addPreRequisite(class20);
    personal.Student student26 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = class20.enroll(student26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    java.lang.String str10 = class7.getName();
    java.lang.String str11 = class7.getID();
    boolean b12 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    java.lang.String str14 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }


    administrative.Class class7 = new administrative.Class("Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n", (int)(byte)0, false, true, (int)'#', "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.toString();
    boolean b10 = class7.isElective();
    java.lang.String str11 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str11.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    administrative.Course course19 = null;
    class17.setCourse(course19);
    java.lang.String str21 = class17.getTeacher();
    java.lang.String str22 = class17.reportIn();
    boolean b23 = class17.isElective();
    java.lang.String str24 = class17.getName();
    personal.Student student25 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = class17.enroll(student25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    java.lang.String str20 = class7.getID();
    java.lang.String str21 = class7.listRequisites();
    java.lang.String str22 = class7.reportIn();
    java.lang.String str23 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "|| "+ "'", str21.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str23.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    java.lang.String str18 = class15.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student19 = class15.getStudents();
    boolean b20 = class7.addPreRequisite(class15);
    java.lang.String str21 = class15.getID();
    java.lang.String str22 = class15.listRequisites();
    administrative.Class class30 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class38 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i39 = class38.getMinCredits();
    java.lang.String str40 = class38.getName();
    java.lang.String str41 = class38.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student42 = class38.getStudents();
    boolean b43 = class30.addPreRequisite(class38);
    java.lang.String str44 = class38.getID();
    boolean b45 = class15.addPreRequisite(class38);
    java.lang.String str46 = class15.getName();
    java.lang.String str47 = class15.toString();
    administrative.Class class55 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i56 = class55.getMinCredits();
    java.lang.String str57 = class55.getName();
    java.lang.String str58 = class55.getID();
    java.lang.String str59 = class55.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student60 = class55.getStudents();
    int i61 = class55.getMinCredits();
    java.lang.String str62 = class55.getID();
    boolean b63 = class15.addPreRequisite(class55);
    administrative.Course course64 = null;
    class55.setCourse(course64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "|"+ "'", str22.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str47.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }


    administrative.Class class7 = new administrative.Class("", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)0, true, false, (int)'#', "|| ");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getName();
    int i10 = class7.getMinCredits();
    java.lang.String str11 = class7.reportIn();
    java.lang.String str12 = class7.getID();
    boolean b13 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str12.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    int i12 = class7.getCredits();
    java.lang.String str13 = class7.listRequisites();
    administrative.Class class21 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str22 = class21.listRequisites();
    java.lang.String str23 = class21.getTeacher();
    administrative.Course course24 = null;
    class21.setCourse(course24);
    java.lang.String str26 = class21.reportIn();
    java.lang.String str27 = class21.getName();
    boolean b28 = class7.addPreRequisite(class21);
    java.util.ArrayList<personal.Student> arraylist_student29 = class21.getStudents();
    java.lang.String str30 = class21.getID();
    int i31 = class21.getCredits();
    java.lang.String str32 = class21.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "|"+ "'", str13.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "|"+ "'", str22.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    administrative.Course course13 = null;
    class7.setCourse(course13);
    administrative.Course course15 = null;
    class7.setCourse(course15);
    boolean b17 = class7.isAvailable();
    personal.Student student18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = class7.enroll(student18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    java.lang.String str31 = class7.reportIn();
    personal.Student student32 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = class7.enroll(student32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    int i8 = class7.getMinCredits();
    java.util.ArrayList<personal.Student> arraylist_student9 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student9);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    administrative.Course course9 = null;
    class7.setCourse(course9);
    boolean b11 = class7.isElective();
    boolean b12 = class7.isElective();
    int i13 = class7.getCredits();
    administrative.Class class21 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    java.lang.String str31 = class29.getName();
    java.lang.String str32 = class29.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student33 = class29.getStudents();
    boolean b34 = class21.addPreRequisite(class29);
    java.lang.String str35 = class21.listRequisites();
    boolean b36 = class7.addPreRequisite(class21);
    java.util.ArrayList<personal.Student> arraylist_student37 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "|| "+ "'", str35.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student37);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 52\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: ||| | \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n| \nProfessor: \nMatriculado(a)s: \n\n", 0, false, false, 0, "|| | ");
    personal.Student student8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = class7.enroll(student8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    boolean b62 = class37.isElective();
    int i63 = class37.getMinCredits();
    int i64 = class37.getMinCredits();
    java.lang.String str65 = class37.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.getID();
    boolean b10 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.lang.String str12 = class7.listRequisites();
    java.lang.String str13 = class7.getTeacher();
    administrative.Class class21 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    java.lang.String str31 = class29.getName();
    java.lang.String str32 = class29.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student33 = class29.getStudents();
    boolean b34 = class21.addPreRequisite(class29);
    java.lang.String str35 = class29.getID();
    java.lang.String str36 = class29.getID();
    boolean b37 = class7.addPreRequisite(class29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    boolean b11 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    boolean b13 = class7.isElective();
    java.lang.String str14 = class7.listRequisites();
    administrative.Class class22 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b23 = class22.isElective();
    java.lang.String str24 = class22.listRequisites();
    administrative.Course course25 = null;
    class22.setCourse(course25);
    java.util.ArrayList<personal.Student> arraylist_student27 = class22.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student28 = class22.getStudents();
    boolean b29 = class7.addPreRequisite(class22);
    int i30 = class7.getMinCredits();
    int i31 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "|"+ "'", str14.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "|"+ "'", str24.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", "Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", (int)'#', false, false, (int)(short)100, "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student9 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }


    administrative.Class class7 = new administrative.Class("", "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", (int)(byte)-1, false, true, 10, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n| \nProfessor: \nMatriculado(a)s: \n\n");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    java.lang.String str23 = class17.listRequisites();
    boolean b24 = class17.isAvailable();
    administrative.Course course25 = null;
    class17.setCourse(course25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "|"+ "'", str23.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }


    administrative.Class class7 = new administrative.Class("", "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n", 10, false, false, 0, "|| | ");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str16 = class15.listRequisites();
    java.lang.String str17 = class15.getTeacher();
    administrative.Course course18 = null;
    class15.setCourse(course18);
    int i20 = class15.getCredits();
    java.lang.String str21 = class15.getName();
    int i22 = class15.getMinCredits();
    boolean b23 = class7.addPreRequisite(class15);
    boolean b24 = class7.isAvailable();
    java.lang.String str25 = class7.listRequisites();
    boolean b26 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "|"+ "'", str16.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "|| "+ "'", str25.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 35\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", (int)'#', true, false, (int)(byte)100, "Nome: || | \nC\u00F3digo: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nCr\u00E9ditos: 1\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", (-1), false, true, 0, "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "|", (int)(byte)10, false, false, (int)(byte)-1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class23 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course24 = null;
    class23.setCourse(course24);
    java.lang.String str26 = class23.getName();
    boolean b27 = class23.isAvailable();
    boolean b28 = class15.addPreRequisite(class23);
    int i29 = class23.getCredits();
    boolean b30 = class7.addPreRequisite(class23);
    java.lang.String str31 = class23.getID();
    java.lang.String str32 = class23.listRequisites();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "|"+ "'", str26.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "|"+ "'", str31.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "|"+ "'", str32.equals("|"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    java.lang.String str13 = class7.getTeacher();
    java.lang.String str14 = class7.getName();
    java.lang.String str15 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str15.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.toString();
    administrative.Class class17 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course18 = null;
    class17.setCourse(course18);
    administrative.Class class27 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "", (int)'a', false, true, (-1), "|| ");
    java.lang.String str28 = class27.toString();
    boolean b29 = class17.addPreRequisite(class27);
    administrative.Course course30 = null;
    class17.setCourse(course30);
    boolean b32 = class7.addPreRequisite(class17);
    java.lang.String str33 = class17.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str28.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }


    administrative.Class class7 = new administrative.Class("|| Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n| ", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", 0, true, false, 0, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 1\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    boolean b8 = class7.isElective();
    boolean b9 = class7.isElective();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    administrative.Class class39 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i40 = class39.getMinCredits();
    java.lang.String str41 = class39.getName();
    java.lang.String str42 = class39.getID();
    java.lang.String str43 = class39.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student44 = class39.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student45 = class39.getStudents();
    boolean b46 = class29.addPreRequisite(class39);
    java.lang.String str47 = class29.getTeacher();
    int i48 = class29.getCredits();
    personal.Student student49 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = class29.enroll(student49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    administrative.Course course19 = null;
    class17.setCourse(course19);
    java.lang.String str21 = class17.getTeacher();
    java.lang.String str22 = class17.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student23 = class17.getStudents();
    administrative.Course course24 = null;
    class17.setCourse(course24);
    boolean b26 = class17.isElective();
    administrative.Course course27 = null;
    class17.setCourse(course27);
    java.lang.String str29 = class17.listRequisites();
    boolean b30 = class17.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "|"+ "'", str29.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    boolean b62 = class37.isElective();
    int i63 = class37.getMinCredits();
    administrative.Course course64 = null;
    class37.setCourse(course64);
    int i66 = class37.getMinCredits();
    java.lang.String str67 = class37.getTeacher();
    java.lang.String str68 = class37.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + ""+ "'", str67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + ""+ "'", str68.equals(""));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "", (int)'a', false, false, (int)(short)10, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    int i8 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }


    administrative.Class class7 = new administrative.Class("", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)0, true, false, (int)'#', "|| ");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getName();
    int i10 = class7.getMinCredits();
    java.lang.String str11 = class7.getID();
    java.lang.String str12 = class7.getName();
    boolean b13 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str11.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    boolean b14 = class7.isAvailable();
    int i15 = class7.getCredits();
    int i16 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class7.getTeacher();
    java.lang.String str20 = class7.getTeacher();
    int i21 = class7.getCredits();
    boolean b22 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    administrative.Class class38 = new administrative.Class("", "", (int)'4', false, false, (int)(short)10, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student39 = class38.getStudents();
    java.lang.String str40 = class38.getID();
    administrative.Class class48 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "|", 32, true, false, 1, "|| ");
    boolean b49 = class38.addPreRequisite(class48);
    boolean b50 = class7.addPreRequisite(class38);
    java.lang.String str51 = class38.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class17.isElective();
    java.lang.String str20 = class17.reportIn();
    administrative.Class class28 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    boolean b29 = class17.addPreRequisite(class28);
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i38 = class37.getMinCredits();
    java.lang.String str39 = class37.reportIn();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b48 = class37.addPreRequisite(class47);
    java.lang.String str49 = class47.reportIn();
    java.lang.String str50 = class47.getID();
    boolean b51 = class47.isElective();
    java.lang.String str52 = class47.toString();
    boolean b53 = class28.addPreRequisite(class47);
    java.lang.String str54 = class47.getName();
    java.lang.String str55 = class47.toString();
    java.lang.String str56 = class47.getTeacher();
    boolean b57 = class47.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str52.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str55.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    boolean b39 = class17.addPreRequisite(class37);
    int i40 = class17.getCredits();
    administrative.Class class48 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str49 = class48.listRequisites();
    java.lang.String str50 = class48.getTeacher();
    administrative.Course course51 = null;
    class48.setCourse(course51);
    java.lang.String str53 = class48.reportIn();
    boolean b54 = class48.isElective();
    java.lang.String str55 = class48.reportIn();
    int i56 = class48.getCredits();
    administrative.Class class64 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str65 = class64.listRequisites();
    administrative.Course course66 = null;
    class64.setCourse(course66);
    java.lang.String str68 = class64.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student69 = class64.getStudents();
    boolean b70 = class48.addPreRequisite(class64);
    boolean b71 = class17.addPreRequisite(class64);
    administrative.Class class79 = new administrative.Class("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "|| ", (int)(short)0, false, true, (int)'a', "Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n");
    java.lang.String str80 = class79.reportIn();
    boolean b81 = class17.addPreRequisite(class79);
    int i82 = class17.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "|"+ "'", str49.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "|"+ "'", str65.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + ""+ "'", str68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str80.equals("Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    int i32 = class17.getMinCredits();
    int i33 = class17.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.reportIn();
    java.lang.String str13 = class7.getName();
    int i14 = class7.getCredits();
    java.lang.String str15 = class7.toString();
    int i16 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str15.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    int i8 = class7.getMinCredits();
    int i9 = class7.getCredits();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getTeacher();
    administrative.Course course13 = null;
    class7.setCourse(course13);
    java.lang.String str15 = class7.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "|"+ "'", str15.equals("|"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: hi!\nC\u00F3digo: |\nCr\u00E9ditos: 100\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", (int)(short)-1, true, true, 97, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "|| Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n| ", 35, false, true, (int)(byte)-1, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    java.lang.String str12 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    java.lang.String str14 = class7.listRequisites();
    java.lang.String str15 = class7.getName();
    java.lang.String str16 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "|"+ "'", str14.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }


    administrative.Class class7 = new administrative.Class("|Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n| ", "Nome: || \nC\u00F3digo: |\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", (int)(short)0, true, false, (int)'a', "Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 35\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nCr\u00E9ditos: -1\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }


    administrative.Class class7 = new administrative.Class("|| Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n| ", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | | \nProfessor: \nMatriculado(a)s: \n\n", (-1), true, false, (int)(short)-1, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.reportIn();
    int i9 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    boolean b14 = class7.isAvailable();
    java.lang.String str15 = class7.toString();
    boolean b16 = class7.isElective();
    administrative.Class class24 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student25 = class24.getStudents();
    java.lang.String str26 = class24.getID();
    boolean b27 = class24.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student28 = class24.getStudents();
    java.lang.String str29 = class24.getTeacher();
    administrative.Class class37 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", "|| | ", (int)(short)10, true, true, 1, "");
    boolean b38 = class24.addPreRequisite(class37);
    administrative.Course course39 = null;
    class37.setCourse(course39);
    boolean b41 = class7.addPreRequisite(class37);
    personal.Student student42 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b43 = class37.enroll(student42);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str15.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    administrative.Class class26 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i27 = class26.getMinCredits();
    java.lang.String str28 = class26.getName();
    java.lang.String str29 = class26.getID();
    java.lang.String str30 = class26.getTeacher();
    java.lang.String str31 = class26.getName();
    boolean b32 = class26.isAvailable();
    boolean b33 = class7.addPreRequisite(class26);
    java.lang.String str34 = class26.listRequisites();
    int i35 = class26.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "|"+ "'", str34.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    java.lang.String str18 = class15.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student19 = class15.getStudents();
    boolean b20 = class7.addPreRequisite(class15);
    boolean b21 = class15.isAvailable();
    boolean b22 = class15.isElective();
    administrative.Class class30 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str31 = class30.listRequisites();
    administrative.Course course32 = null;
    class30.setCourse(course32);
    int i34 = class30.getMinCredits();
    java.lang.String str35 = class30.toString();
    boolean b36 = class15.addPreRequisite(class30);
    boolean b37 = class30.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "|"+ "'", str31.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str35.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.getName();
    java.lang.String str30 = class27.getID();
    java.lang.String str31 = class27.getTeacher();
    java.lang.String str32 = class27.getName();
    java.lang.String str33 = class27.reportIn();
    boolean b34 = class7.addPreRequisite(class27);
    boolean b35 = class7.isAvailable();
    java.lang.String str36 = class7.getTeacher();
    personal.Student student37 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b38 = class7.enroll(student37);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }


    administrative.Class class7 = new administrative.Class("", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)0, true, false, (int)'#', "|| ");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getName();
    int i10 = class7.getMinCredits();
    java.lang.String str11 = class7.reportIn();
    java.lang.String str12 = class7.getID();
    boolean b13 = class7.isAvailable();
    java.lang.String str14 = class7.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str12.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str14.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.getName();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class17.isElective();
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    boolean b39 = class27.isAvailable();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student48 = class47.getStudents();
    java.lang.String str49 = class47.getID();
    boolean b50 = class27.addPreRequisite(class47);
    boolean b51 = class17.addPreRequisite(class27);
    int i52 = class17.getMinCredits();
    administrative.Class class60 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str61 = class60.listRequisites();
    administrative.Course course62 = null;
    class60.setCourse(course62);
    boolean b64 = class17.addPreRequisite(class60);
    boolean b65 = class7.addPreRequisite(class17);
    boolean b66 = class7.isElective();
    int i67 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "|"+ "'", str61.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)(byte)10, false, false, (int)'4', "|| ");
    java.lang.String str8 = class7.getTeacher();
    int i9 = class7.getMinCredits();
    java.lang.String str10 = class7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|| "+ "'", str8.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    java.lang.String str20 = class17.getName();
    java.lang.String str21 = class17.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }


    administrative.Class class7 = new administrative.Class("|| | ", "", (int)' ', true, false, (int)' ', "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|| | "+ "'", str10.equals("|| | "));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    boolean b11 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    boolean b13 = class7.isElective();
    administrative.Class class21 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i22 = class21.getMinCredits();
    java.lang.String str23 = class21.reportIn();
    administrative.Class class31 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b32 = class21.addPreRequisite(class31);
    boolean b33 = class21.isAvailable();
    administrative.Class class41 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student42 = class41.getStudents();
    java.lang.String str43 = class41.getID();
    boolean b44 = class21.addPreRequisite(class41);
    boolean b45 = class7.addPreRequisite(class41);
    int i46 = class41.getMinCredits();
    boolean b47 = class41.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    administrative.Course course19 = null;
    class17.setCourse(course19);
    java.lang.String str21 = class17.getTeacher();
    int i22 = class17.getCredits();
    java.lang.String str23 = class17.getTeacher();
    java.lang.String str24 = class17.getID();
    administrative.Course course25 = null;
    class17.setCourse(course25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    administrative.Class class30 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i31 = class30.getMinCredits();
    java.lang.String str32 = class30.reportIn();
    administrative.Class class40 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b41 = class30.addPreRequisite(class40);
    boolean b42 = class30.isAvailable();
    administrative.Class class50 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student51 = class50.getStudents();
    java.lang.String str52 = class50.getID();
    boolean b53 = class30.addPreRequisite(class50);
    boolean b54 = class30.isAvailable();
    java.lang.String str55 = class30.reportIn();
    boolean b56 = class17.addPreRequisite(class30);
    int i57 = class30.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    int i20 = class7.getCredits();
    boolean b21 = class7.isElective();
    int i22 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.reportIn();
    java.lang.String str10 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    int i12 = class7.getMinCredits();
    java.lang.String str13 = class7.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str13.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    administrative.Course course19 = null;
    class17.setCourse(course19);
    java.lang.String str21 = class17.getTeacher();
    java.lang.String str22 = class17.reportIn();
    boolean b23 = class17.isElective();
    java.lang.String str24 = class17.getName();
    java.util.ArrayList<personal.Student> arraylist_student25 = class17.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student25);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.listRequisites();
    java.lang.String str10 = class7.reportIn();
    int i11 = class7.getCredits();
    int i12 = class7.getCredits();
    boolean b13 = class7.isAvailable();
    java.lang.String str14 = class7.toString();
    boolean b15 = class7.isAvailable();
    java.lang.String str16 = class7.getName();
    boolean b17 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str14.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.listRequisites();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i18 = class17.getMinCredits();
    java.lang.String str19 = class17.reportIn();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b28 = class17.addPreRequisite(class27);
    boolean b29 = class17.isAvailable();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student38 = class37.getStudents();
    java.lang.String str39 = class37.getID();
    boolean b40 = class17.addPreRequisite(class37);
    boolean b41 = class7.addPreRequisite(class17);
    java.util.ArrayList<personal.Student> arraylist_student42 = class7.getStudents();
    boolean b43 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    int i13 = class7.getMinCredits();
    java.lang.String str14 = class7.toString();
    administrative.Course course15 = null;
    class7.setCourse(course15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str14.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }


    administrative.Class class7 = new administrative.Class("Nome: hi!\nC\u00F3digo: |\nCr\u00E9ditos: 100\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", "", 1, true, false, (int)' ', "Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "|", (int)(byte)10, false, false, (int)(byte)-1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course16 = null;
    class15.setCourse(course16);
    java.lang.String str18 = class15.getName();
    boolean b19 = class15.isAvailable();
    boolean b20 = class7.addPreRequisite(class15);
    java.util.ArrayList<personal.Student> arraylist_student21 = class15.getStudents();
    personal.Student student22 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b23 = class15.enroll(student22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "|"+ "'", str18.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student21);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str8 = class7.toString();
    administrative.Course course9 = null;
    class7.setCourse(course9);
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    boolean b12 = class7.isAvailable();
    java.lang.String str13 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str13.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    java.lang.String str10 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.lang.String str12 = class7.toString();
    administrative.Class class20 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i21 = class20.getMinCredits();
    java.lang.String str22 = class20.getName();
    java.lang.String str23 = class20.getID();
    java.lang.String str24 = class20.getTeacher();
    java.lang.String str25 = class20.getName();
    java.util.ArrayList<personal.Student> arraylist_student26 = class20.getStudents();
    boolean b27 = class7.addPreRequisite(class20);
    java.lang.String str28 = class20.listRequisites();
    java.lang.String str29 = class20.getTeacher();
    personal.Student student30 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b31 = class20.enroll(student30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str12.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "|"+ "'", str28.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.reportIn();
    java.lang.String str20 = class17.getID();
    java.lang.String str21 = class17.getName();
    java.lang.String str22 = class17.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", 32, false, true, (int)'a', "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.listRequisites();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }


    administrative.Class class7 = new administrative.Class("hi!", "", (int)(short)10, false, false, (int)(byte)100, "|| ");
    java.lang.String str8 = class7.listRequisites();
    administrative.Class class16 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i17 = class16.getMinCredits();
    java.lang.String str18 = class16.getName();
    java.lang.String str19 = class16.getID();
    java.lang.String str20 = class16.getTeacher();
    java.lang.String str21 = class16.getName();
    java.lang.String str22 = class16.toString();
    java.lang.String str23 = class16.reportIn();
    boolean b24 = class7.addPreRequisite(class16);
    java.util.ArrayList<personal.Student> arraylist_student25 = class7.getStudents();
    int i26 = class7.getMinCredits();
    administrative.Course course27 = null;
    class7.setCourse(course27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str22.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 100);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }


    administrative.Class class7 = new administrative.Class("Nome: hi!\nC\u00F3digo: |\nCr\u00E9ditos: 100\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", 97, true, false, (int)'4', "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)10, true, false, (int)' ', "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getID();
    int i18 = class15.getCredits();
    java.util.ArrayList<personal.Student> arraylist_student19 = class15.getStudents();
    boolean b20 = class7.addPreRequisite(class15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str17.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    boolean b32 = class29.isElective();
    boolean b33 = class29.isAvailable();
    int i34 = class29.getMinCredits();
    java.lang.String str35 = class29.getTeacher();
    java.lang.String str36 = class29.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }


    administrative.Class class7 = new administrative.Class("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", 1, false, false, (int)(byte)100, "|| ");
    java.lang.String str8 = class7.getID();
    java.lang.String str9 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    java.lang.String str12 = class7.getName();
    java.lang.String str13 = class7.toString();
    java.util.ArrayList<personal.Student> arraylist_student14 = class7.getStudents();
    int i15 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str13.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "", 10, false, true, 0, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    int i8 = class7.getCredits();
    java.lang.String str9 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 0\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 0\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    boolean b11 = class7.isAvailable();
    int i12 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", 0, true, false, (int)(byte)1, "|");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.toString();
    java.lang.String str10 = class7.reportIn();
    java.lang.String str11 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "|"+ "'", str11.equals("|"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }


    administrative.Class class7 = new administrative.Class("Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 52\nPre-requisitos: |\nProfessor: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", (int)(byte)-1, false, true, 32, "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    administrative.Class class25 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i26 = class25.getMinCredits();
    java.lang.String str27 = class25.getName();
    java.lang.String str28 = class25.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student29 = class25.getStudents();
    boolean b30 = class15.addPreRequisite(class25);
    int i31 = class15.getMinCredits();
    java.lang.String str32 = class15.getID();
    boolean b33 = class7.addPreRequisite(class15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }


    administrative.Class class7 = new administrative.Class("", "", (int)'4', false, false, (int)(short)10, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student20 = class17.getStudents();
    administrative.Course course21 = null;
    class17.setCourse(course21);
    java.lang.String str23 = class17.reportIn();
    boolean b24 = class17.isAvailable();
    java.lang.String str25 = class17.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    boolean b22 = class17.isElective();
    administrative.Class class30 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i31 = class30.getMinCredits();
    java.lang.String str32 = class30.reportIn();
    administrative.Class class40 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b41 = class30.addPreRequisite(class40);
    boolean b42 = class30.isAvailable();
    administrative.Class class50 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student51 = class50.getStudents();
    java.lang.String str52 = class50.getID();
    boolean b53 = class30.addPreRequisite(class50);
    boolean b54 = class30.isAvailable();
    java.lang.String str55 = class30.reportIn();
    boolean b56 = class17.addPreRequisite(class30);
    boolean b57 = class17.isAvailable();
    java.lang.String str58 = class17.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.listRequisites();
    java.lang.String str13 = class7.getName();
    java.lang.String str14 = class7.reportIn();
    int i15 = class7.getMinCredits();
    java.util.ArrayList<personal.Student> arraylist_student16 = class7.getStudents();
    personal.Student student17 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = class7.enroll(student17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student16);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n", 35, false, true, (int)(byte)10, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.reportIn();
    java.lang.String str9 = class7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 35\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 35\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    administrative.Class class17 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "", (int)'a', false, true, (-1), "|| ");
    java.lang.String str18 = class17.toString();
    boolean b19 = class7.addPreRequisite(class17);
    int i20 = class7.getMinCredits();
    boolean b21 = class7.isAvailable();
    java.lang.String str22 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str18.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: || \nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str22.equals("Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: || \nProfessor: hi!\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.listRequisites();
    int i13 = class7.getCredits();
    java.lang.String str14 = class7.getID();
    int i15 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    administrative.Class class38 = new administrative.Class("", "", (int)'4', false, false, (int)(short)10, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student39 = class38.getStudents();
    java.lang.String str40 = class38.getID();
    administrative.Class class48 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "|", 32, true, false, 1, "|| ");
    boolean b49 = class38.addPreRequisite(class48);
    boolean b50 = class7.addPreRequisite(class38);
    boolean b51 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student52 = class7.getStudents();
    int i53 = class7.getCredits();
    boolean b54 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    boolean b39 = class17.addPreRequisite(class37);
    java.lang.String str40 = class17.listRequisites();
    java.lang.String str41 = class17.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "|| "+ "'", str40.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str41.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    int i20 = class7.getCredits();
    java.lang.String str21 = class7.getName();
    administrative.Course course22 = null;
    class7.setCourse(course22);
    administrative.Course course24 = null;
    class7.setCourse(course24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    java.lang.String str12 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    java.lang.String str14 = class7.listRequisites();
    administrative.Class class22 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str23 = class22.toString();
    boolean b24 = class7.addPreRequisite(class22);
    java.lang.String str25 = class22.reportIn();
    boolean b26 = class22.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "|"+ "'", str14.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str23.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    java.lang.String str14 = class7.listRequisites();
    administrative.Course course15 = null;
    class7.setCourse(course15);
    java.lang.String str17 = class7.reportIn();
    java.lang.String str18 = class7.getID();
    java.util.ArrayList<personal.Student> arraylist_student19 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "|"+ "'", str14.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getName();
    java.lang.String str13 = class7.getName();
    int i14 = class7.getMinCredits();
    java.util.ArrayList<personal.Student> arraylist_student15 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student15);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }


    administrative.Class class7 = new administrative.Class("|| ", "|", (int)(short)0, true, true, 10, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    personal.Student student9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = class7.enroll(student9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    boolean b32 = class29.isElective();
    boolean b33 = class29.isAvailable();
    int i34 = class29.getMinCredits();
    java.lang.String str35 = class29.getTeacher();
    java.lang.String str36 = class29.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }


    administrative.Class class7 = new administrative.Class("Nome: hi!\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", (int)' ', false, true, (int)(short)10, "");
    int i8 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 32);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }


    administrative.Class class7 = new administrative.Class("hi!", "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n", (int)(byte)1, false, false, (int)(short)1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.reportIn();
    administrative.Class class16 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i17 = class16.getMinCredits();
    java.lang.String str18 = class16.reportIn();
    administrative.Class class26 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b27 = class16.addPreRequisite(class26);
    boolean b28 = class16.isAvailable();
    boolean b29 = class7.addPreRequisite(class16);
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i38 = class37.getMinCredits();
    java.lang.String str39 = class37.reportIn();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b48 = class37.addPreRequisite(class47);
    java.lang.String str49 = class47.listRequisites();
    administrative.Course course50 = null;
    class47.setCourse(course50);
    boolean b52 = class47.isElective();
    java.lang.String str53 = class47.reportIn();
    boolean b54 = class16.addPreRequisite(class47);
    java.lang.String str55 = class16.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "|"+ "'", str49.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    java.lang.String str18 = class15.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student19 = class15.getStudents();
    boolean b20 = class7.addPreRequisite(class15);
    boolean b21 = class15.isAvailable();
    boolean b22 = class15.isElective();
    java.lang.String str23 = class15.getName();
    personal.Student student24 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = class15.enroll(student24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.reportIn();
    java.lang.String str10 = class7.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    administrative.Class class19 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "|", (int)(byte)10, false, false, (int)(byte)-1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.lang.String str20 = class19.getTeacher();
    boolean b21 = class7.addPreRequisite(class19);
    java.lang.String str22 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str20.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str22.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getID();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i18 = class17.getMinCredits();
    java.lang.String str19 = class17.reportIn();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b28 = class17.addPreRequisite(class27);
    boolean b29 = class17.isAvailable();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student38 = class37.getStudents();
    java.lang.String str39 = class37.getID();
    boolean b40 = class17.addPreRequisite(class37);
    boolean b41 = class7.addPreRequisite(class37);
    boolean b42 = class37.isElective();
    boolean b43 = class37.isElective();
    boolean b44 = class37.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }


    administrative.Class class7 = new administrative.Class("", "", (int)'4', false, false, (int)(short)10, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.getID();
    administrative.Class class17 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "|", 32, true, false, 1, "|| ");
    boolean b18 = class7.addPreRequisite(class17);
    int i19 = class7.getMinCredits();
    boolean b20 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    administrative.Class class19 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "", (int)'a', false, true, (-1), "|| ");
    java.lang.String str20 = class19.toString();
    java.lang.String str21 = class19.reportIn();
    boolean b22 = class7.addPreRequisite(class19);
    boolean b23 = class19.isElective();
    java.lang.String str24 = class19.getTeacher();
    administrative.Class class32 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str33 = class32.toString();
    java.lang.String str34 = class32.reportIn();
    java.lang.String str35 = class32.getName();
    boolean b36 = class19.addPreRequisite(class32);
    java.lang.String str37 = class19.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str20.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str21.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "|| "+ "'", str24.equals("|| "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str33.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "|"+ "'", str35.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str37.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.listRequisites();
    java.lang.String str13 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student14 = class7.getStudents();
    int i15 = class7.getCredits();
    int i16 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "|"+ "'", str12.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i28 = class27.getMinCredits();
    java.lang.String str29 = class27.reportIn();
    administrative.Class class37 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b38 = class27.addPreRequisite(class37);
    java.lang.String str39 = class37.listRequisites();
    administrative.Class class47 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i48 = class47.getMinCredits();
    java.lang.String str49 = class47.reportIn();
    administrative.Class class57 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b58 = class47.addPreRequisite(class57);
    boolean b59 = class37.addPreRequisite(class57);
    java.lang.String str60 = class37.getTeacher();
    boolean b61 = class17.addPreRequisite(class37);
    java.lang.String str62 = class17.getName();
    java.lang.String str63 = class17.toString();
    int i64 = class17.getMinCredits();
    int i65 = class17.getCredits();
    int i66 = class17.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "|"+ "'", str39.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str63.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    java.lang.String str9 = class7.reportIn();
    java.lang.String str10 = class7.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    administrative.Class class19 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", "|", (int)(byte)10, false, false, (int)(byte)-1, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n");
    java.lang.String str20 = class19.getTeacher();
    boolean b21 = class7.addPreRequisite(class19);
    java.lang.String str22 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str9.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str20.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: ||| \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str22.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: ||| \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    int i32 = class29.getCredits();
    java.lang.String str33 = class29.getID();
    java.lang.String str34 = class29.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str34.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    java.lang.String str10 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.lang.String str12 = class7.toString();
    administrative.Class class20 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i21 = class20.getMinCredits();
    java.lang.String str22 = class20.getName();
    java.lang.String str23 = class20.getID();
    java.lang.String str24 = class20.getTeacher();
    java.lang.String str25 = class20.getName();
    java.util.ArrayList<personal.Student> arraylist_student26 = class20.getStudents();
    boolean b27 = class7.addPreRequisite(class20);
    java.lang.String str28 = class20.getID();
    java.lang.String str29 = class20.getID();
    int i30 = class20.getMinCredits();
    administrative.Class class38 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i39 = class38.getMinCredits();
    java.lang.String str40 = class38.reportIn();
    administrative.Class class48 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b49 = class38.addPreRequisite(class48);
    java.lang.String str50 = class48.listRequisites();
    administrative.Course course51 = null;
    class48.setCourse(course51);
    administrative.Class class60 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i61 = class60.getMinCredits();
    boolean b62 = class48.addPreRequisite(class60);
    boolean b63 = class60.isElective();
    java.lang.String str64 = class60.toString();
    java.lang.String str65 = class60.toString();
    boolean b66 = class60.isAvailable();
    administrative.Class class74 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student75 = class74.getStudents();
    java.lang.String str76 = class74.getID();
    java.lang.String str77 = class74.toString();
    administrative.Course course78 = null;
    class74.setCourse(course78);
    administrative.Class class80 = null;
    boolean b81 = class74.addPreRequisite(class80);
    boolean b82 = class60.addPreRequisite(class74);
    boolean b83 = class20.addPreRequisite(class74);
    java.lang.String str84 = class20.getID();
    boolean b85 = class20.isElective();
    java.lang.String str86 = class20.getID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str12.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "|"+ "'", str50.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str64.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str65.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + ""+ "'", str76.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str77.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + ""+ "'", str84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + ""+ "'", str86.equals(""));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    administrative.Course course9 = null;
    class7.setCourse(course9);
    java.lang.String str11 = class7.getTeacher();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    java.lang.String str13 = class7.getID();
    java.lang.String str14 = class7.getTeacher();
    boolean b15 = class7.isAvailable();
    boolean b16 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    java.lang.String str19 = class17.listRequisites();
    administrative.Course course20 = null;
    class17.setCourse(course20);
    administrative.Class class29 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i30 = class29.getMinCredits();
    boolean b31 = class17.addPreRequisite(class29);
    int i32 = class29.getMinCredits();
    int i33 = class29.getMinCredits();
    boolean b34 = class29.isElective();
    java.lang.String str35 = class29.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "|"+ "'", str19.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    int i31 = class7.getMinCredits();
    boolean b32 = class7.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b8 = class7.isElective();
    java.lang.String str9 = class7.listRequisites();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    boolean b14 = class7.isElective();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    java.lang.String str10 = class7.getID();
    java.lang.String str11 = class7.getTeacher();
    java.lang.String str12 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student13 = class7.getStudents();
    java.lang.String str14 = class7.listRequisites();
    administrative.Class class22 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str23 = class22.toString();
    boolean b24 = class7.addPreRequisite(class22);
    java.lang.String str25 = class22.reportIn();
    java.lang.String str26 = class22.listRequisites();
    administrative.Course course27 = null;
    class22.setCourse(course27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "|"+ "'", str14.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str23.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "|"+ "'", str26.equals("|"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.reportIn();
    boolean b13 = class7.isElective();
    int i14 = class7.getCredits();
    administrative.Class class22 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class30 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i31 = class30.getMinCredits();
    java.lang.String str32 = class30.getName();
    java.lang.String str33 = class30.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student34 = class30.getStudents();
    boolean b35 = class22.addPreRequisite(class30);
    java.lang.String str36 = class22.getID();
    java.lang.String str37 = class22.reportIn();
    boolean b38 = class7.addPreRequisite(class22);
    java.lang.String str39 = class7.getTeacher();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str36.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str37.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i18 = class17.getMinCredits();
    java.lang.String str19 = class17.reportIn();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b28 = class17.addPreRequisite(class27);
    java.lang.String str29 = class27.reportIn();
    boolean b30 = class7.addPreRequisite(class27);
    java.lang.String str31 = class7.getTeacher();
    java.lang.String str32 = class7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str32.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: ||| \nProfessor: hi!\nMatriculado(a)s: \n\n\nC\u00F3digo: |\nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n", (int)' ', true, false, 1, "Nome: Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nC\u00F3digo: hi!\nCr\u00E9ditos: -1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n");

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str8 = class7.listRequisites();
    java.lang.String str9 = class7.getTeacher();
    administrative.Course course10 = null;
    class7.setCourse(course10);
    java.lang.String str12 = class7.getName();
    administrative.Course course13 = null;
    class7.setCourse(course13);
    administrative.Class class22 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i23 = class22.getMinCredits();
    java.lang.String str24 = class22.reportIn();
    administrative.Class class32 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b33 = class22.addPreRequisite(class32);
    boolean b34 = class22.isAvailable();
    administrative.Class class42 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student43 = class42.getStudents();
    java.lang.String str44 = class42.getID();
    boolean b45 = class22.addPreRequisite(class42);
    int i46 = class22.getCredits();
    java.lang.String str47 = class22.getID();
    boolean b48 = class7.addPreRequisite(class22);
    java.lang.String str49 = class22.reportIn();
    int i50 = class22.getMinCredits();
    java.lang.String str51 = class22.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "|"+ "'", str8.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str51.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }


    administrative.Class class7 = new administrative.Class("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "|| ", (int)(short)0, false, true, (int)'a', "Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n");
    java.lang.String str8 = class7.reportIn();
    java.lang.String str9 = class7.listRequisites();
    java.lang.String str10 = class7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n\nC\u00F3digo: || \nCr\u00E9ditos: 0\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 0\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 35\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str10.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    administrative.Course course31 = null;
    class27.setCourse(course31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    boolean b9 = class7.isAvailable();
    java.lang.String str10 = class7.getName();
    java.util.ArrayList<personal.Student> arraylist_student11 = class7.getStudents();
    java.lang.String str12 = class7.toString();
    administrative.Class class20 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i21 = class20.getMinCredits();
    java.lang.String str22 = class20.getName();
    java.lang.String str23 = class20.getID();
    java.lang.String str24 = class20.getTeacher();
    java.lang.String str25 = class20.getName();
    java.util.ArrayList<personal.Student> arraylist_student26 = class20.getStudents();
    boolean b27 = class7.addPreRequisite(class20);
    administrative.Class class35 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i36 = class35.getMinCredits();
    java.lang.String str37 = class35.getName();
    java.lang.String str38 = class35.getID();
    java.lang.String str39 = class35.getTeacher();
    java.lang.String str40 = class35.getName();
    java.lang.String str41 = class35.toString();
    boolean b42 = class7.addPreRequisite(class35);
    java.lang.String str43 = class7.getName();
    java.lang.String str44 = class7.reportIn();
    int i45 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str12.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"+ "'", str41.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }


    administrative.Class class7 = new administrative.Class("|| ", "|", (int)(short)0, true, true, 10, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    administrative.Class class16 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.lang.String str17 = class16.listRequisites();
    administrative.Course course18 = null;
    class16.setCourse(course18);
    java.lang.String str20 = class16.getTeacher();
    boolean b21 = class7.addPreRequisite(class16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "|"+ "'", str17.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.reportIn();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b18 = class7.addPreRequisite(class17);
    boolean b19 = class7.isAvailable();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student28 = class27.getStudents();
    java.lang.String str29 = class27.getID();
    boolean b30 = class7.addPreRequisite(class27);
    java.lang.String str31 = class7.reportIn();
    java.lang.String str32 = class7.reportIn();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    boolean b11 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    java.lang.String str13 = class7.toString();
    int i14 = class7.getMinCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str13.equals("Nome: |\nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }


    administrative.Class class7 = new administrative.Class("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "", (int)'4', false, true, (int)'#', "Nome: || | \nC\u00F3digo: |\nCr\u00E9ditos: 32\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 10\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "", (int)'a', false, true, (-1), "|| ");
    java.lang.String str8 = class7.toString();
    java.lang.String str9 = class7.listRequisites();
    java.util.ArrayList<personal.Student> arraylist_student10 = class7.getStudents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"+ "'", str8.equals("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 97\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: -1\nPre-requisitos: |\nProfessor: || \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "|"+ "'", str9.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student10);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }


    administrative.Class class7 = new administrative.Class("Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 10\nEletiva: N\u00E3o\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 0\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || | \nProfessor: \nMatriculado(a)s: \n\n", (int)(short)0, true, false, 35, "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 10\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 32\nPre-requisitos: |\nProfessor: Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }


    administrative.Class class7 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    administrative.Class class15 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i16 = class15.getMinCredits();
    java.lang.String str17 = class15.getName();
    java.lang.String str18 = class15.reportIn();
    java.util.ArrayList<personal.Student> arraylist_student19 = class15.getStudents();
    boolean b20 = class7.addPreRequisite(class15);
    java.lang.String str21 = class7.getTeacher();
    java.lang.String str22 = class7.reportIn();
    int i23 = class7.getCredits();
    boolean b24 = class7.isElective();
    administrative.Class class32 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i33 = class32.getMinCredits();
    java.lang.String str34 = class32.reportIn();
    administrative.Class class42 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b43 = class32.addPreRequisite(class42);
    boolean b44 = class32.isAvailable();
    administrative.Class class52 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    java.util.ArrayList<personal.Student> arraylist_student53 = class52.getStudents();
    java.lang.String str54 = class52.getID();
    boolean b55 = class32.addPreRequisite(class52);
    int i56 = class32.getCredits();
    administrative.Course course57 = null;
    class32.setCourse(course57);
    boolean b59 = class7.addPreRequisite(class32);
    int i60 = class7.getCredits();
    java.lang.String str61 = class7.getTeacher();
    java.lang.String str62 = class7.listRequisites();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str21.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str22.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: || \nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"+ "'", str61.equals("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "|| | "+ "'", str62.equals("|| | "));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }


    administrative.Class class7 = new administrative.Class("Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n", "|", 32, true, false, 1, "|| ");
    administrative.Class class15 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)'4', true, true, (int)(byte)100, "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student16 = class15.getStudents();
    java.lang.String str17 = class15.reportIn();
    java.lang.String str18 = class15.reportIn();
    boolean b19 = class7.addPreRequisite(class15);
    administrative.Course course20 = null;
    class15.setCourse(course20);
    boolean b22 = class15.isAvailable();
    java.lang.String str23 = class15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str17.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str18.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"+ "'", str23.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 52\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 100\nPre-requisitos: |\nProfessor: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nMatriculado(a)s: \n\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }


    administrative.Class class7 = new administrative.Class("|", "|", (int)' ', true, false, (int)(short)-1, "hi!");
    administrative.Course course8 = null;
    class7.setCourse(course8);
    java.lang.String str10 = class7.getName();
    boolean b11 = class7.isAvailable();
    java.util.ArrayList<personal.Student> arraylist_student12 = class7.getStudents();
    boolean b13 = class7.isElective();
    java.lang.String str14 = class7.getTeacher();
    int i15 = class7.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "|"+ "'", str10.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 32);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }


    administrative.Class class7 = new administrative.Class("|| ", "|", (int)(short)0, true, true, 10, "Nome: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: || \nProfessor: \nMatriculado(a)s: \n\n\nC\u00F3digo: \nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: Sim\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: |\nMatriculado(a)s: \n\n");
    java.util.ArrayList<personal.Student> arraylist_student8 = class7.getStudents();
    administrative.Class class16 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i17 = class16.getMinCredits();
    boolean b18 = class16.isAvailable();
    java.lang.String str19 = class16.getName();
    java.util.ArrayList<personal.Student> arraylist_student20 = class16.getStudents();
    administrative.Course course21 = null;
    class16.setCourse(course21);
    boolean b23 = class7.addPreRequisite(class16);
    int i24 = class16.getCredits();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }


    administrative.Class class7 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i8 = class7.getMinCredits();
    java.lang.String str9 = class7.getName();
    administrative.Class class17 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i18 = class17.getMinCredits();
    java.lang.String str19 = class17.reportIn();
    administrative.Class class27 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    boolean b28 = class17.addPreRequisite(class27);
    java.lang.String str29 = class27.reportIn();
    boolean b30 = class7.addPreRequisite(class27);
    administrative.Class class38 = new administrative.Class("", "", (int)(byte)1, false, false, (int)(short)1, "");
    int i39 = class38.getMinCredits();
    java.lang.String str40 = class38.getName();
    java.lang.String str41 = class38.getID();
    java.lang.String str42 = class38.getTeacher();
    java.lang.String str43 = class38.getName();
    java.util.ArrayList<personal.Student> arraylist_student44 = class38.getStudents();
    java.lang.String str45 = class38.listRequisites();
    administrative.Class class53 = new administrative.Class("|", "Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n", (int)(byte)100, true, false, (int)'a', "hi!");
    java.lang.String str54 = class53.toString();
    boolean b55 = class38.addPreRequisite(class53);
    int i56 = class53.getCredits();
    java.util.ArrayList<personal.Student> arraylist_student57 = class53.getStudents();
    boolean b58 = class27.addPreRequisite(class53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "|"+ "'", str45.equals("|"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"+ "'", str54.equals("Nome: |\nC\u00F3digo: Nome: \nC\u00F3digo: \nCr\u00E9ditos: 1\nEletiva: N\u00E3o\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 1\nPre-requisitos: |\nProfessor: \nMatriculado(a)s: \n\n\nCr\u00E9ditos: 100\nEletiva: Sim\nDispon\u00EDvel: N\u00E3o\nCr\u00E9ditos necess\u00E1rios: 97\nPre-requisitos: |\nProfessor: hi!\nMatriculado(a)s: \n\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_student57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

}
