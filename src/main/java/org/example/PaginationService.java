package org.example;

public class PaginationService {
    private String[] data;
    private int elementsPerPage;
    public PaginationService(String[] data, int elementsPerPage) {
        this.data = data;
        this.elementsPerPage = elementsPerPage;
    }
    public int getElementsCount() {
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result++;
        }
        return result;
    }
    public int getPageNumberByElementIndex(int index) {
        if (data == null) {
            return -1;
        }
        int row = getElementsCount() / elementsPerPage;
        if (getElementsCount() % 2 == 1){
            row++;
        }
        int k = 0;
        String pages[][] = new String[row][elementsPerPage];
        for (int i = 0; i < pages.length; i++) {
            for (int j = 0; j < pages[i].length; j++) {
                pages[i][j] = data[k];
                k++;
                if (pages[i][j].equals(data[index])) {
                    return i;
                }
            }
        }
        return -1;
    }
}
