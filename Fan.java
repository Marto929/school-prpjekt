package domashnoit;

public class Fan {
	
	    final int SLOW = 1;
	    final int MEDIUM = 2;
	    final int FAST = 3;
	    private int speed;
	    private boolean switchedOn;
	    private double radius;
	    private String color;

	    public Fan(){
	        this.speed = this.SLOW;
	        this.switchedOn = false;
	        this.radius = 5;
	        this.color = "blue";
	    }

	    public int getSpeed(){
	        return this.speed;
	    }
	    public boolean isSwitchedOn(){
	        return this.switchedOn;
	    }
	    public double getRadius(){
	        return this.radius;
	    }
	    public String getColor(){
	        return this.color;
	    }
	    public void setSpeed(int newSpeed){
	        this.speed = newSpeed;
	    }
	    public void switchOn(){
	        this.switchedOn = true;
	    }
	    public void switchOff(){
	        this.switchedOn = false;
	    }
	    public void setColor(String newColor){
	        this.color = newColor;
	    }
	    public void setRadius(double newRadius){
	        this.radius = newRadius;
	    }
	public String toString() {
			if(switchedOn) {
				return "Fan speed=" + speed + ", radius=" + radius + ", color=" + color;	
			}else {
				return "Radius=" + radius + ", color=" + color + " , the fan is turned off";
			}
	}
	}
		
	
