package com.gdn.qa.test.test.data;

import com.gdn.qa.automation.core.restassured.ResponseApi;
import com.gdn.qa.test.test.models.response.GetProjectList;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("com.gdn.qa.test.test.data.BadakData")
public class BadakData {
  private ResponseApi<GetProjectList> projectResponse;
}
