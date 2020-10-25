第三次JAVA实验作业

实验目的：
1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2、掌握面向对象的类设计方法（属性、方法）；
3、掌握类的继承用法，通过构造方法实例化对象；
4、学会使用super()，用于实例化子类；
5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

实验过程：
在课上时咱曾尝试将人员作为父类，教师、学生为子类共同继承人员，课程当主类，结果码到课程发现没法继续进行。
之后花了半天时间搞懂输入输出语法（Scanner）
最蛋疼的就是CSDN的函数声明与书上的声明不一样（书上是import java.util.Scanner，CSDN是 import java.io.*;import java.util.*; ）
将输入输出自己设题码字搞懂后最终采用书上的方法，并将码的题的思路运用在了程序中
第二次尝试是将人员作为父类，教师、学生为子类，课程为公共类，新增加系统当主类。人员输入学生和教师的编号，姓名，性别，年龄（新增）
学生继承人员的函数和方法，增加了选课的中文提示；教师继承人员的函数和方法，加入判断语句进行教师教授课程区分。
系统负责系统主体框架，主要语句、语法为循环、输入和判断。
如：什么学生选什么课，首先用判断语句判断用户输入的是哪个学生，然后用循环语句进入选课环节，继续用判断语句判断该学生是否选课，已选课则用判断是否退课或退出选课系统，未选课则判断用户输入选择的是哪门课。然后进入已选课判断是否退课或退出选课系统。（一开始的循环设置为循环两次，如果第一、二次选择退课则循环数归零，重新选课；若选择退出则循环为2，退出循环）
顺便学了一下书签（retry）,goto多好用,java竟然不支持，啊啊啊啊啊啊啊啊啊。
码了两个下午，主要是语法和思路，码字快。

核心代码：
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
                            }else if(tuike ==0){
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

实验结果：
结果分支极多，欢迎自己尝试，咱这里搞个较为简单的结果：
学生编号：1、2
教师编号：11、12
课程编号：101、102
请输入编号查询学生/教师/课程相关信息，输入后回车确认
学生选课/退课请直接输入0后回车确认
不支持直接退出哦~ 查询后方可退出
1
编号:1，小明，男，18岁，所选课程:无
想再次查询请输入1，退出请输入0
1
请输入编号查询学生/教师/课程相关信息，输入后回车确认
学生选课/退课请直接输入0后回车确认
不支持直接退出哦~ 查询后方可退出
0
请输入选课/退课学生编号
1
请输入课程编号后回车选择课程
离散数学:101
JAVA:102
101
输入1后回车退课
输入0后回车退出选课系统
0
想再次查询请输入1，退出请输入0
1
请输入编号查询学生/教师/课程相关信息，输入后回车确认
学生选课/退课请直接输入0后回车确认
不支持直接退出哦~ 查询后方可退出
1
编号:1，小明，男，18岁，所选课程:高等数学
想再次查询请输入1，退出请输入0
0

进程已结束,退出代码0

实验感想：
首先说一下自己代码的优点：
易懂，系统用的各种数据结构和方法极其简单，没有任何复杂的语句，逻辑性强，要求完成度极高。
缺点：
1、有几块判断没加最后的else（既其他情况），这代表着如果有人输入了规范之外的数字就会发生咱也不清楚什么情况的BUG；
2、根本没用到super和toString（）,堪称本末倒置；
3、可以简化和优化的地方实在是太多，将很多函数改成数组后不仅能精简程序，还能新加一堆数据，而且快速，简洁；
4、其他类的功能较为鸡肋，父子类没有太大用途；
5、用户体验不咋滴，系统提示与引导较少（再给一天时间.jpg）
嗯，几乎都是缺点QWQ
其实缺点都好解决，但需要大量时间完善。最后吐槽一句：课上讲讲那些与C语言不同的语句把求求了QWQ，输入语句给咱都搞傻了。
