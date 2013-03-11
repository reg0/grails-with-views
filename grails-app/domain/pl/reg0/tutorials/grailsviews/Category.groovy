package pl.reg0.tutorials.grailsviews

class Category {

    String nameKey
    Category parentCategory

    static constraints = {
        parentCategory nullable: true
    }

    static transients = ['children']
    
    List<Category> getChildren() {
        Category.findAllByParentCategory(this)
    }
}
