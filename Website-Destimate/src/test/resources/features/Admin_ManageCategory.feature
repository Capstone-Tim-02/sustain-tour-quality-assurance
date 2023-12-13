#Feature: Manage Category (Create Category, Update Category, Delete Category, Searching Category, Range of Table Results, and Pagination)
#
#  As an user
#  I want to manage category
#  So that the application works according to admin requirements
#
#  @CreateCategory
#  @TC_AW_30
#  Scenario: Create Category [TC_AW_30] - Verify success to create a new category with valid name of category [Positive 1]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I click Tambah Kategori button
#    And I input valid name of new category
#    And I click Tambah Kategori option
#    Then Validate success to create a new category with valid name and display message "Kategori berhasil dibuat"
#
#  @TC_AW_31
#  Scenario: Create Category [TC_AW_31] - Verify failed to create a new category because input an existing name [Negative 1]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I click Tambah Kategori button
#    And I input the name of the category that already exists
#    And I click Tambah Kategori option
#    Then Validate failed to create a new category because input an existing name and display message "Kategori ini sudah ada"
#
#  @TC_AW_32
#  Scenario: Create Category [TC_AW_32] - Verify failed to create a new category because input invalid name [Negative 2]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I click Tambah Kategori button
#    And I input invalid name of category
#    And I click Tambah Kategori option
#    Then Validate failed to create a new category because input invalid name and display message "Nama kategori minimal 5 karakter"
#
#  @TC_AW_33
#  Scenario: Create Category [TC_AW_33] - Verify failed to create a new category because did not input name of the category [Negative 3]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I click Tambah Kategori button
#    And I did not input name of the category
#    And I click Tambah Kategori option
#    Then Validate failed to create a new category because did not input name and display message "Nama Kategori tidak boleh kosong!"
#
#  @TC_AW_34
#  Scenario: Create Category [TC_AW_34] - Verify success to cancel for create new category [Positive 2]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I click Tambah Kategori button
#    And I input valid name of new category
#    And I click Cancel option
#    Then Validate success to cancel for create new category
#
#
#
#
#
#
#  @UpdateCategory
#  @TC_AW_35
#  Scenario: Update Category [TC_AW_35] - Verify success to update category "Air terjun" with valid name [Positive 3]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to edit
#    And I click the update button on the selected category
#    And I edit data category with valid name
#    And I click the Simpan button
#    Then Validate success to update category with valid name and display message "Berhasil mengupdate kategori"
#
#  @TC_AW_36
#  Scenario: Update Category [TC_AW_36] - Verify failed to update category "wisata alam" because input an existing name [Negative 4]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to edit
#    And I click the update button on the selected category
#    And I input name of the category that already exists
#    And I click the Simpan button
#    Then Validate failed to update category because name already exists and display message "Kategori sudah ada"
#
#  @TC_AW_37
#  Scenario: Update Category [TC_AW_37] - Verify failed to update category "wisata alam" because input invalid name [Negative 5]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to edit
#    And I click the update button on the selected category
#    And I edit data category with invalid name
#    And I click the Simpan button
#    Then Validate failed to update category because invalid name and display message "Nama kategori minimal 5 karakter"
#
#  @TC_AW_38
#  Scenario: Update Category [TC_AW_38] - Verify failed to update category "Air terjun" because did not input name of the category [Negative 6]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to edit
#    And I click the update button on the selected category
#    And I edit data category without input the name of category
#    And I click the Simpan button
#    Then Validate failed to update category because did not input name and display message "Nama Kategori tidak boleh kosong!"
#
#  @TC_AW_39
#  Scenario: Update Category [TC_AW_39] - Verify success to cancel for update data category [Positive 4]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to edit
#    And I click the update button on the selected category
#    And I edit data category with valid name
#    And I click the Cancel button
#    Then Validate success to cancel for update category
#
#
#
#
#
#
#
#
#  @DeleteCategory
#  @TC_AW_40
#  Scenario: Delete Category [TC_AW_40] - Verify success to delete category "Wisata Air Terjun" [Positive 5]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to delete
#    And I click the delete button or icon on the selected category
#    And I click the Hapus button
#    Then Validate success to delete category and display message "Kategori berhasil dihapus"
#
#  @TC_AW_41
#  Scenario: Delete Category [TC_AW_41] - Verify success to cancel for delete user category [Positive 6]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search name of the category that i want to delete
#    And I click the delete button or icon on the selected category
#    And I click Cancel button
#    Then Validate success to cancel for delete category
#
#
#
#
#
#
#
#
#
#  @SearchingCategory
#  @TC_AW_42
#  Scenario: Searching Category [TC_AW_42] - Verify success to search category for existing name [Positive 7]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I search the name of the category that i want to search
#    Then Validate success to display the search result for the category
#
#  @TC_AW_43
#  Scenario: Searching Category [TC_AW_43] - Verify failed to search category because input Non-Existent name [Negative 7]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I input non existent category in the search field
#    Then Validate failed to search category and display message "Data Tidak Tersedia"
#
#
#
#
#
#
#
#
#
#
#
#
#
#  @RangeOfTableResultsCategory
#  @TC_AW_44
#  Scenario: Range of Table Results [TC_AW_44] - Verify success to displays data with a maximum of 50 data results [Positive 8]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I scrolls down and then click maksimal Tampilan button
#    And I choose the option Tampilkan 50 Data
#    Then Validate success to display data category between 0 to 50 data
#
#  @TC_AW_45
#  Scenario: Range of Table Results [TC_AW_45] - Verify success to displays data with a maximum of 100 data results [Positive 9]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    And I scrolls down and then click maksimal Tampilan button
#    And I choose the option Tampilkan 100 Data
#    Then Validate success to display category between 0 to 100 data
#
#
#
#
#
#
#
#
#
#
#
#  @PaginationCategory
#  @TC_AW_46
#  Scenario: Pagination [TC_AW_46] - Verify success to displays the next page which also contains other categories [Positive 10]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
#    #And I scrolls down and then click the next button
#    Then Validate success to displays the next page which also contains the other categories
#
#  @TC_AW_47
#  Scenario: Pagination [TC_AW_47] - Verify success to displays the previous page which also contains other categories [Positive 11]
#    Given I will login and already on the dashboard of the Destimate
#    When I click menu Category
##    And I scrolls down and then click the next button
##    And I scrolls down and then click the back button
#    Then Validate success to displays the previous page which also contains the category
