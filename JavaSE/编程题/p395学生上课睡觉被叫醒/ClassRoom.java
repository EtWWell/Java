public class ClassRoom implements Runnable{
	Thread student1, student2, teacher;
	ClassRoom(){
		student1 = new Thread(this);
		student1.setName("张三");
		student2 = new Thread(this);
		student2.setName("李四");
		teacher = new Thread(this);
		teacher.setName("王老师");
		try{
			student1.setPriority(10);
			student2.setPriority(10);
		}catch(IllegalArgumentException e){}
	}
	public void run(){
		if(Thread.currentThread() ==  student1){
			try{
				System.out.println(student1.getName()+"正在睡觉，不听课");
				Thread.sleep(1000*60*10);
			}catch(InterruptedException e){
				System.out.println(student1.getName()+"被老师叫醒了");
			}
			System.out.println(student1.getName()+"开始听课");
		}else if(Thread.currentThread() == student2){
			try{
				System.out.println(student2.getName()+"正在睡觉，不听课");
				Thread.sleep(1000*60*60);
			}catch(InterruptedException e){
				System.out.println(student2.getName()+"被老师叫醒了");
			}
			System.out.println(student2.getName()+"开始听课");
		}else if(Thread.currentThread() == teacher){
			for(int i = 0; i < 3; i++){
				System.out.println("上课！");
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){}
			}
			student1.interrupt();
			student2.interrupt();
		}
	}
}