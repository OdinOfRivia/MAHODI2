package com.example.actualsms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class TStudentMenu {

    @FXML
    private TableColumn<Student, > age;

    @FXML
    private TableColumn<?, ?> country;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> firstName;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> lastName;

    @FXML
    private TableColumn<?, ?> phoneNumber;

    @FXML
    private TableView<?> tableID;


    @FXML
    void addStudentBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tAddStudent.fxml");
    }

    @FXML
    void backBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("TeacherMain.fxml");
    }

    @FXML
    void edditStudentBTN(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("tEdditStudent.fxml");
    }

}

//    @FXML
//    private void handleDisplayTables(ActionEvent event) throws NullPointerException {
//        try {
//            conn = getConnection();
//            PreparedStatement statement = conn.prepareStatement("SELECT * FROM BOOKS");
//            rs = statement.executeQuery();
//            bookList = FXCollections.observableArrayList();
//
//            while (rs.next()) {
//                String title = rs.getString("title");
//                String authorFirstName = rs.getString("authorFirstName");
//                String authorLastName = rs.getString("authorLastName");
//                int isbn = rs.getInt("isbn");
//                int numberOfPages = rs.getInt("numberOfPages");
//
//                bookList.add(new Book(title, authorFirstName, authorLastName,isbn, numberOfPages));
//
//                System.out.println(title + " " + authorFirstName + " " + authorLastName + " " + isbn + " " + numberOfPages);
//
//
//
//
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
////        title.setCellValueFactory(new PropertyValueFactory<>("title"));
////        isbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
////        authorFirstName.setCellValueFactory(new PropertyValueFactory<>("authorFirstName"));
////        authorLastName.setCellValueFactory(new PropertyValueFactory<>("authorLastName"));
////        numberOfPages.setCellValueFactory(new PropertyValueFactory<>("numberOfPages"));
//
////        title.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitle()));
////        authorFirstName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAuthorFirstName()));
////        authorLastName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getAuthorLastName()));
////        isbn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIsbn()).asObject());
////        numberOfPages.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getNumberOfPages()).asObject());
//
//        title.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Book)cellData.getValue()).getTitle()));});
//        authorFirstName.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Book)cellData.getValue()).getAuthorFirstName()));});
//        authorLastName.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((Book)cellData.getValue()).getAuthorLastName()));});
//        isbn.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((Book)cellData.getValue()).getIsbn())).asObject();});
//        numberOfPages.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((Book)cellData.getValue()).getNumberOfPages())).asObject();});
//        bookTable.setItems(bookList);
//        bookTable.getColumns().addAll(title,authorFirstName,authorLastName,isbn,numberOfPages);
//        bookTable.refresh();
//    }
//
