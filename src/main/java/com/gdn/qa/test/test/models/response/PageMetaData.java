package com.gdn.qa.test.test.models.response;

import lombok.Data;

@Data
public class PageMetaData {

  public Integer pageSize;
  public Integer pageNumber;
  public Integer total;

}
