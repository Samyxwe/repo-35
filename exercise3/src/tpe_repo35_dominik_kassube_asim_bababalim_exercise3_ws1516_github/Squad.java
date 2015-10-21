package tpe_repo35_dominik_kassube_asim_bababalim_exercise3_ws1516_github;

public class Squad {

	private double elfendollar=2000;
	protected double lifepoints;
	protected double strength;
	protected double speed;
	protected double ruestung;
	Menschen [] a= new Menschen [7];
	Untote [] beißer=new Untote [8];
	
	Squad(){
		for (int i = 0; i < a.length ; i++) {
			a[i]=new Menschen();
			elfendollar-=a[i].cost;
		}
		for (int i = 0; i < beißer.length && elfendollar>=150; i++) {
			beißer[i]=new Untote();
		}
		
	}
	
	public void attack(){
		
	}
	
}
