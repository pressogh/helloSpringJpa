package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryForm {
    @NotBlank(message = "카테고리 이름을 입력하세요")
    @Size(max = 50, message = "50자 이내로 입력하세요")
    private String name;

    public Category toEntity() {
        return new Category(this.name);
    }

    public static CategoryForm from(Category category) {
        CategoryForm form = new CategoryForm();
        form.name = category.getName();

        return form;
    }
}
