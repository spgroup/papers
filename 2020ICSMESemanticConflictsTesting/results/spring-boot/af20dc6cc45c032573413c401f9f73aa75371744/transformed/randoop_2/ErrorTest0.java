import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL6 = explodedArchive0.getUrl();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = fileEntry0.isDirectory();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry1 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file2 = fileEntry1.file;
        java.io.File file3 = fileEntry1.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive4 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest1 = explodedArchive0.getManifest();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest6 = explodedArchive0.getManifest();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = explodedArchive0.iterator();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str5 = fileEntry4.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive6 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest2 = explodedArchive0.getManifest();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry2 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file3 = fileEntry2.getFile();
        java.io.File file4 = fileEntry2.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive5 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator2 = explodedArchive0.spliterator();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry1 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str2 = fileEntry1.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive3 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest3 = explodedArchive0.getManifest();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL3 = explodedArchive0.getUrl();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.io.File file3 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file5 = fileEntry4.getFile();
        java.io.File file6 = fileEntry4.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive7 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.io.File file3 = fileEntry0.file;
        fileEntry0.name = "exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor7 = explodedArchive0.iterator();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.io.File file3 = fileEntry0.file;
        fileEntry0.name = "exploded archive";
        java.io.File file6 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.io.File file2 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL2 = explodedArchive0.getUrl();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.manifestFile;
        java.io.File file6 = explodedArchive0.root;
        explodedArchive0.recursive = true;
        boolean boolean9 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor10 = explodedArchive0.iterator();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.io.File file3 = fileEntry0.file;
        fileEntry0.name = "exploded archive";
        java.io.File file6 = fileEntry0.file;
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        boolean boolean4 = explodedArchive0.recursive;
        java.io.File file5 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest6 = explodedArchive0.getManifest();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator7 = explodedArchive0.spliterator();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "hi!";
        java.lang.String str4 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        boolean boolean4 = explodedArchive0.recursive;
        boolean boolean5 = explodedArchive0.recursive;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry6 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file7 = fileEntry6.getFile();
        java.io.File file8 = fileEntry6.getFile();
        java.lang.String str9 = fileEntry6.name;
        fileEntry6.name = "";
        java.io.File file12 = fileEntry6.file;
        java.io.File file13 = fileEntry6.getFile();
        java.io.File file14 = fileEntry6.file;
        java.lang.String str15 = fileEntry6.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive16 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        boolean boolean4 = explodedArchive0.recursive;
        boolean boolean5 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator6 = explodedArchive0.spliterator();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.lang.String str4 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file7 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        java.io.File file2 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        java.io.File file4 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        fileEntry0.name = "";
        fileEntry0.name = "exploded archive";
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        java.io.File file9 = fileEntry0.file;
        java.lang.String str10 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        java.io.File file2 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest3 = explodedArchive0.getManifest();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.manifestFile;
        java.io.File file6 = explodedArchive0.root;
        explodedArchive0.recursive = true;
        boolean boolean9 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest10 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator11 = explodedArchive0.spliterator();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        fileEntry0.name = "";
        fileEntry0.name = "exploded archive";
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        java.io.File file9 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator1 = explodedArchive0.spliterator();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.file;
        java.lang.String str2 = fileEntry0.name;
        fileEntry0.name = "";
        fileEntry0.name = "exploded archive";
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        java.io.File file2 = fileEntry0.getFile();
        java.io.File file3 = fileEntry0.file;
        fileEntry0.name = "exploded archive";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "hi!";
        fileEntry0.name = "exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.io.File file3 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.util.jar.Manifest manifest1 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest7 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL8 = explodedArchive0.getUrl();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        java.io.File file8 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }
}

