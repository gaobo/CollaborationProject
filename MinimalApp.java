import java.util.Scanner;

public class MinimalApp {
    public static void main(String[] args) {
        // 1. 输出基础信息
        System.out.println("极简Java程序 v1.0");
        
        // 2. 获取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的名字: ");
        String name = scanner.nextLine();
        
        // 3. 处理并输出结果
        System.out.println("你好, " + name + "!");
        System.out.println("程序运行结束");
    }
}