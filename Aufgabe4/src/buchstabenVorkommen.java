
public class buchstabenVorkommen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text =
				"Lorem ipsum dolor sit amet, consectetur adipisici elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat. Quis aute iure reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint obcaecat cupiditat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\n\n" + "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.\n\n" + "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.\n\n" + "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.";
	zaehlen(text);
	}

	private static void zaehlen(String text) {
		// TODO Auto-generated method stub
		text = text.toLowerCase();
		int zaehlerA=0;
		int zaehlerB=0;
		int zaehlerC=0;
		int zaehlerD=0;
		int zaehlerE=0;
		int zaehlerF=0;
		int zaehlerG=0;
		int zaehlerH=0;
		int zaehlerI=0;
		int zaehlerJ=0;
		int zaehlerK=0;
		int zaehlerL=0;
		int zaehlerM=0;
		int zaehlerN=0;
		int zaehlerO=0;
		int zaehlerP=0;
		int zaehlerQ=0;
		int zaehlerR=0;
		int zaehlerS=0;
		int zaehlerT=0;
		int zaehlerU=0;
		int zaehlerV=0;
		int zaehlerW=0;
		int zaehlerX=0;
		int zaehlerY=0;
		int zaehlerZ=0;
		
		for (int i=0; i<text.length();i++){
			switch (text.charAt(i)){
			case 'a': zaehlerA+=1; break;
			case 'b': zaehlerB+=1; break;
			case 'c': zaehlerC+=1; break;
			case 'd': zaehlerD+=1; break;
			case 'e': zaehlerE+=1; break;
			case 'f': zaehlerF+=1; break;
			case 'g': zaehlerG+=1; break;
			case 'h': zaehlerH+=1; break;
			case 'i': zaehlerI+=1; break;
			case 'j': zaehlerJ+=1; break;
			case 'k': zaehlerK+=1; break;
			case 'l': zaehlerL+=1; break;
			case 'm': zaehlerM+=1; break;
			case 'n': zaehlerN+=1; break;
			case 'o': zaehlerO+=1; break;
			case 'p': zaehlerP+=1; break;
			case 'q': zaehlerQ+=1; break;
			case 'r': zaehlerR+=1; break;
			case 's': zaehlerS+=1; break;
			case 't': zaehlerT+=1; break;
			case 'u': zaehlerU+=1; break;
			case 'v': zaehlerV+=1; break;
			case 'w': zaehlerW+=1; break;
			case 'x': zaehlerX+=1; break;
			case 'y': zaehlerY+=1; break;
			case 'z': zaehlerZ+=1; break;
			default: zaehlerA+=0; break;
			}
		}
		System.out.println("a: "+zaehlerA);
		System.out.println("b: "+zaehlerB);
		System.out.println("c: "+zaehlerC);
		System.out.println("d: "+zaehlerD);
		System.out.println("e: "+zaehlerE);
		System.out.println("f: "+zaehlerF);
		System.out.println("g: "+zaehlerG);
		System.out.println("h: "+zaehlerH);
		System.out.println("i: "+zaehlerI);
		System.out.println("j: "+zaehlerJ);
		System.out.println("k: "+zaehlerK);
		System.out.println("l: "+zaehlerL);
		System.out.println("m: "+zaehlerM);
		System.out.println("n: "+zaehlerN);
		System.out.println("o: "+zaehlerO);
		System.out.println("p: "+zaehlerP);
		System.out.println("q: "+zaehlerQ);
		System.out.println("r: "+zaehlerR);
		System.out.println("s: "+zaehlerS);
		System.out.println("t: "+zaehlerT);
		System.out.println("u: "+zaehlerU);
		System.out.println("v: "+zaehlerV);
		System.out.println("w: "+zaehlerW);
		System.out.println("x: "+zaehlerX);
		System.out.println("y: "+zaehlerY);
		System.out.println("z: "+zaehlerZ);
	}

}
