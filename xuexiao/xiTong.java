package xuexiao;

import java.util.Scanner;

public class xiTong {
    public static void main(String args[]){
        System.out.println("学生编号：1、2");
        System.out.println("教师编号：11、12");
        System.out.println("课程编号：101、102");
        jiaoShi jS = new jiaoShi();
        xueSheng xS = new xueSheng();
        keCheng kC = new keCheng();
        int keChengBianHao1 = 0;        //这块可以搞成数组，因为就俩学生俩课程就懒得搞了。
        int keChengBianHao2 = 0;
        for(int a=0;a<2;a++){
            System.out.println("请输入编号查询学生/教师/课程相关信息，输入后回车确认");
            System.out.println("学生选课/退课请直接输入0后回车确认");
            System.out.println("不支持直接退出哦~ 查询后方可退出");
            Scanner chaxun = new Scanner(System.in);
            int bianhao = chaxun.nextInt();
            if(bianhao == 1){           //这块如果要拓展的话可以将bianhao后面的数字变成数组，然后用循环语句挨个对比
                xS.bianHao(1);
                xS.suoXuanKeCheng();
                kC.keChengMingCheng(keChengBianHao1);
            }else if(bianhao == 2) {
                xS.bianHao(2);
                xS.suoXuanKeCheng();
                kC.keChengMingCheng(keChengBianHao2);
            }else if(bianhao == 11){
                jS.bianHao(11);
                jS.suoShouKeCheng(11);
            }else if(bianhao == 12){
                jS.bianHao(12);
                jS.suoShouKeCheng(12);
            }else if(bianhao == 101){
                kC.keChengXinXi(101);
            }else if(bianhao == 102){
                kC.keChengXinXi(102);
            }
            else if(bianhao == 0){           //选课系统
                System.out.println("请输入选课/退课学生编号");
                Scanner xueShengXuanTui = new Scanner(System.in);
                int xSBH = xueShengXuanTui.nextInt();   //xSBH为xueShengBianHao（学生编号）的开头首字母的缩写
                if(xSBH == 1){                          //学生1，学生2同理，将keChengBianHao1变成2即可
                    retry:
                    for(int b=0;b<2;b++){               //如果该学生没课，则选课，如果有课，则选择是否退课。
                        if(keChengBianHao1 == 0){       //没课情况
                            System.out.println("请输入课程编号后回车选择课程");
                            System.out.println("离散数学:101");
                            System.out.println("JAVA:102");
                            Scanner xuanKe = new Scanner(System.in);
                            int xuanke = xuanKe.nextInt();
                            if(xuanke == 101){
                                keChengBianHao1 = 101;
                            }else if(xuanke == 102){
                                keChengBianHao1 = 102;
                            }else {
                                System.out.println("请输入正确课程编号");
                                b = 0;
                                break retry;
                            }
                        }else if (keChengBianHao1 == 101 ||keChengBianHao1 == 102){   //有课情况
                            System.out.println("输入1后回车退课");
                            System.out.println("输入0后回车退出选课系统");
                            Scanner tuiKe = new Scanner(System.in);
                            int tuike = tuiKe.nextInt();
                            if(tuike == 1){
                                keChengBianHao1 = 0;
                                b = 2;
                            }else if(tuike ==0){
                                break;
                            }else{
                                System.out.println("请重新进行选择课程");
                                b = 0;
                                break retry;
                            }
                        }
                    }
                }else if(xSBH == 2){
                    retry:
                    for(int b=0;b<2;b++){               //如果该学生没课，则选课，如果有课，则选择是否退课。
                        if(keChengBianHao2 == 0){       //没课情况
                            System.out.println("请输入课程编号后回车选择课程");
                            System.out.println("离散数学:101");
                            System.out.println("JAVA:102");
                            Scanner xuanKe = new Scanner(System.in);
                            int xuanke = xuanKe.nextInt();
                            if(xuanke == 101){
                                keChengBianHao2 = 101;
                            }else if(xuanke == 102){
                                keChengBianHao2 = 102;
                            }else {
                                System.out.println("请输入正确课程编号");
                                b=0;
                                break retry;
                            }
                        }else if (keChengBianHao2 == 101 ||keChengBianHao2 == 102){   //有课情况
                            System.out.println("输入1后回车退课");
                            System.out.println("输入0后回车退出选课系统");
                            Scanner tuiKe = new Scanner(System.in);
                            int tuike = tuiKe.nextInt();
                            if(tuike == 1){
                                keChengBianHao2 = 0;
                                b = 2;
                            }else if(tuike == 0){
                                break;
                            }else{
                                System.out.println("请重新进行选择课程");
                                b = 0;
                                break retry;
                            }
                        }
                    }
                }
            }                                           //if语句末尾
            System.out.println("想再次查询请输入1，退出请输入0");
            Scanner tuichu = new Scanner(System.in);
            int xuanze = tuichu.nextInt();
            if(xuanze == 1){
                a = 0;
            }else if(xuanze == 0){
                a = 2;
            }
        }
    }
}
