package day012;

import java.util.Objects;

public class Box {
	private int height;
	private int length;
	private int breadth;
	
	public Box() {
		length = 1;
		breadth = 2;
		height = 3;
	}
	
	public Box(int side) {
		length = breadth = height = side;
	}

	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int volume() {
		return length * breadth * height;
	}

	@Override
	public String toString() {
		return "Box [height=" + height + ", length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, height, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
//		return breadth == other.breadth && height == other.height && length == other.length;
		return this.volume() == other.volume();
	}
	
}
