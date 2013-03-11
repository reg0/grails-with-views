package pl.reg0.tutorials.grailsviews

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Category)
class CategoryTests {

    void testGetChildren() {
        Category root = new Category(nameKey: 'category.root').save()
        Category category1 = new Category(nameKey: 'category.cars', parentCategory: root).save()
        Category category2 = new Category(nameKey: 'category.motorcycles', parentCategory: root).save()
        Category category11 = new Category(nameKey: 'category.cars.bmw', parentCategory: category1).save()
        Category category12 = new Category(nameKey: 'category.cars.volkswagen', parentCategory: category1).save()
        Category category21 = new Category(nameKey: 'category.motorcycles.harley', parentCategory: category2).save()
        Category category22 = new Category(nameKey: 'category.motorcycles.honda', parentCategory: category2).save()

        assert [category1, category2] == root.children
        assert [category11, category12] == category1.children
        assert [category21, category22] == category2.children
        assert [] == category12.children
    }
}
