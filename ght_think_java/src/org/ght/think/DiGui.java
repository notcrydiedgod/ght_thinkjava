package org.ght.think;

public class DiGui {
		public static void main(String[] args) {
			
			String pathB = "/P/y/z/a/b/c/d/34/c.php";
			String pathA = "/P/y/z/a/b/a/g/e.php";
			
			System.out.println(pathARelativePathB(pathA,pathB,0));
		}
		  
		public static String pathARelativePathB(String pathA , String pathB, int i){
			if(pathA.contains(pathB)){
				StringBuilder replaceSb = new StringBuilder();  
				if(i==1){
					replaceSb.append(".");
				}else{
					while(i>1){
						replaceSb.append("../");
						--i;
					}
				}
				return pathA.replace(pathB,replaceSb.substring(0, replaceSb.lastIndexOf("/")));
			}else{
				return pathARelativePathB(pathA,pathB.substring(0,pathB.lastIndexOf("/")),++i);
			}
		}
}
