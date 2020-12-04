package domashnoit;

public class RegularPolygon {
	 private int n;
	    private double sideLength;
	    private double x;
	    private double y;

	    public RegularPolygon(){
	        this.n = 3;
	        this.sideLength = 1;
	        this.x = 0;
	        this.y = 0;
	    }
	    public RegularPolygon(int n, double sideLength){
	        this.n = n;
	        this.sideLength = sideLength;
	        this.x = 0;
	        this.y = 0;
	    }
	    public RegularPolygon(int n, double sideLength, double x, double y){
	        this.n = n;
	        this.sideLength = sideLength;
	        this.x = x;
	        this.y = y;
	    }

	    public int getN(){
	        return this.n;
	    }
	    public double getSideLength(){
	        return this.sideLength;
	    }
	    public double getX(){
	        return this.x;
	    }
	    public double getY(){
	        return this.y;
	    }

	    public void setN(int n) {
	        this.n = n;
	    }
	    public void setSideLength(double sideLength) {
	        this.sideLength = sideLength;
	    }
	    public void setX(double x) {
	        this.x = x;
	    }
	    public void setY(double y) {
	        this.y = y;
	    }

	    public double getPerimeter(){
	        return this.n*this.sideLength;
	    }
	    public double getArea(){
	        double deg = Math.PI/this.getN();
	        return (this.getN()*this.getSideLength()*this.getSideLength())/(4*Math.tan(deg));
	    }

	}

