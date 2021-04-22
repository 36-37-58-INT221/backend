package int221.practice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {

	@Id
	private String colorId;
	private String code;

	public Color() {
	};

	public Color(String colorId, String colorCode) {
		super();
		this.colorId = colorId;
		this.code = colorCode;
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public String getColorCode() {
		return code;
	}

	public void setColorCode(String colorCode) {
		this.code = colorCode;
	}

}
