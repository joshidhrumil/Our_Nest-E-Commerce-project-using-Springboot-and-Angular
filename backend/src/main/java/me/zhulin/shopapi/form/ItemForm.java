package me.zhulin.shopapi.form;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created By Zhu Lin on 3/11/2018.
 */
@Data
public class ItemForm {
  
	@Min(value = 1)
    private Integer quantity;
    @NotEmpty
    private String productId;
    public ItemForm() {
  		super();
  		// TODO Auto-generated constructor stub
  	}
	public ItemForm(@Min(1) Integer quantity, @NotEmpty String productId) {
		super();
		this.quantity = quantity;
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
}
