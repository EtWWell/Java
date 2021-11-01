class PC{
	CPU cpu;
	HardDisk hardDisk;

	void setCPU(CPU a){
		cpu = a;
	}
	void setHardDisk(HardDisk b){
		hardDisk = b;
	}
	void show(){
		System.out.println("CPU的速度："+cpu.speed);
		System.out.println("硬盘的容量："+hardDisk.amount);
	}
}