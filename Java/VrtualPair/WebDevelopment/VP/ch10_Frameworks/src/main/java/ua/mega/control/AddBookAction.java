package ua.mega.control;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ua.mega.domain.Book;
import ua.mega.forms.BookForm;
import ua.mega.services.BookService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class AddBookAction extends Action {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        BookForm bookToAdd = (BookForm) form;

        BookService bookService = BookService.getService();
        // converting BookForm to Domain class
        Book book = new Book(bookToAdd.getIsbn(), bookToAdd.getTitle(), bookToAdd.getAuthor(), new Double(bookToAdd.getPrice()));
        bookService.registerNewBook(book);

        return mapping.findForward("addBookSuccessful");

    }
}
