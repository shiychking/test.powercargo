package test.powercargo;

public class stringLearn {
	public static void main(String[] args) {

        System.out.println(10-1>=9);
		float[][]  myFloats =new float[][]{{0.0f,0.1f,0.2f},{0.03f,0.4f,0.5f},{0.6f,0.7f,0.8f},{0.9f,1.0f,1.1f}};
		for(int index= 0 ;index< myFloats.length;index++) {
			System.out.println(String.format("第%d行数，刚添加的信息", index));
			for(int index1=0;index1<myFloats[index].length;index1++) {
				
			    System.out.println(myFloats[index][index1]);			
			}
		}
			
		
	}


}
