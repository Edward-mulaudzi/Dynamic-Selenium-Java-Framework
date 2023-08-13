package project.utils;


import project.pages.SamplePage;

public class PageObjectsRepository {
    public static SamplePage samplePage;
    public  static ReusableMethods reusableMethods;
    public static void createPageInstance(){
        samplePage = new SamplePage();
        reusableMethods = new ReusableMethods();
    }
}
