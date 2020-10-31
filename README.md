# java第三次实验
学生选课系统
2020322096 计G202 申麓
# 实验目的
1. 初步了解分析系统需求
2. 掌握面向对象的类设计方法（属性、方法）；
3. 掌握类的继承用法，通过构造方法实例化对象；
4. 学会使用super()，用于实例化子类；
5. 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
# 实验要求
一共建立了四个对象 person teacher student course，并且teacher和student继承person类
- public person(int id,String sex)
- public Teacher(int id,String teacherName,String sex)
- public Student(int stuId,String stuName,String sex)
- public Course(int courseId,String courseName,float credit,Teacher teacher)
# UML图
![alert](https://github.com/shenlu-hub/-/blob/main/%E5%AE%9E%E9%AA%8C%E4%B8%89UML.PNG)
# 实验过程
创建五个类：person，teacher，student，course，SelectMain，给前四个类定义参数和赋值
## teacher类
```
public Teacher(int id,String teacherName,String sex){
        this.id = id;
        this.teacherName = teacherName;
        this.sex = sex;
    }
```
## student类
```
 public Student(int stuId,String stuName,String sex) {
        super();
        this.stuId = stuId;
        this.stuName = stuName;
        this.sex = sex;
        courses = new Course[3];
    }
 ```
## course类
```
public Course(int courseId,String courseName,Teacher teacher) {
        super();
        this.courseId=courseId;
        this.courseName=courseName;
        this.setTeacher(teacher);
        students = new Student[30];
        teachers = new Teacher[1];
    }
```
把调用和打印输出都写在SelectMain类里面，例如：
```
Student stu0 = new Student(1001,"Lily","女");
stu0.addCourse(cour0);
stu0.displayCourse();
```
## 删除操作
调用course中的removeStudent函数
```
 public boolean removeStudent(Student stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){//选过这门课
            for(int i=0;i<students.length;i++){
                if(students[i]==stu){
                    students[i]=null;
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
 ```
