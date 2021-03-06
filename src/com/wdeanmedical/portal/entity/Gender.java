package com.wdeanmedical.portal.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 3894174828996429492L;
  private String name;
  private String code;
    

   public Gender() {
   }
    
  @Column(name = "name")
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  @Column(name = "code")
  public String getCode() { return code; }
  public void setCode(String code) { this.code = code; }
    
}
