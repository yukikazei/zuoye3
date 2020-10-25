package xuexiao;
public class renYuan {
    void bianHao(int x){
        if(x == 1){
            System.out.print("编号:1，小明，男，18岁");
        }else if(x == 2){
            System.out.print("编号:2，小红，女，17岁");
        }else if(x == 11){
            System.out.print("编号:11，张三，男，30岁");
        }else if(x == 12){
            System.out.print("编号:12，李四，女，29岁");
        }else {
            System.out.println("请输入正确编号");
        }
    }
}