class  GarbageCollector
{

	public static void main(String [] args) {
		Runtime rt = Runtime.getRuntime();
		long mem = rt.freeMemory();
		System.out.println("Memória livre: "+mem);
		System.gc();
		mem = 	rt.freeMemory();
		System.out.println("GC - Memória Livre: "+mem);
	}

}
