package study.chapter03.test18.composite_pattern.software;

//文本文件类
class TextFile {  
    private String name;  
  
    public TextFile(String name) {  
        this.name = name;  
    }  
  
    public void killVirus() {  
        //简化代码，模拟杀毒  
        System.out.println("----对文本文件'" + name + "'进行杀毒");  
    }  
}  