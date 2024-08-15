package JavaBasicProgram;
interface Animal{
	void bark();
	
}
 class InterfaceClass implements Animal {

	@Override
	public void bark() {
		
	}
	public void speak() {
		System.out.println("Dog is barking");
	}
	public static void main(String[] args) {
		InterfaceClass intf = new InterfaceClass();
		intf.speak();
	}

}
