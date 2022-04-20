package com.abhi.Assignment5;

import com.abhi.Assignment5.entity.CloudServiceCategory;
import com.abhi.Assignment5.repostitory.CloudServiceCategoryRepos;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Assignment5ApplicationTests {

	@Autowired
	private CloudServiceCategoryRepos repos;

	@Test
	void testAddCategory() {
		CloudServiceCategory cloudServiceCategory = new CloudServiceCategory();
		cloudServiceCategory.setId(1);
		cloudServiceCategory.setCategoryName("Computer Services");
		repos.save(cloudServiceCategory);

		CloudServiceCategory addCat = repos.findById(1).get();
		assertNotNull(addCat);
	}

}
