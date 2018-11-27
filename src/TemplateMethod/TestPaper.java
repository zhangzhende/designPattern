package TemplateMethod;

abstract class TestPaper {

    public void testQuestion1(){
        System.out.println("第一道题的答案有：abcd");
        System.out.println(""+answer1());
    }
    public void testQuestion2(){
        System.out.println("第二道题的答案有：abcd");
        System.out.println(""+answer2());
    }
    public void testQuestion3(){
        System.out.println("第三道题的答案有：abcd");
        System.out.println(""+answer3());
    }

    public  String answer1(){
        return "";
    }
    public  String answer2(){
        return "";
    }
    public  String answer3(){
        return "";
    }
}
