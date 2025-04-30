public class StackSurat15 {
    Surat15[] suratStack;
    int size, top;

    public StackSurat15(int capacity) {
        this.size = capacity;
        this.suratStack = new Surat15[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat15 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak dapat menambah surat.");
        } else {
            suratStack[++top] = surat;
            System.out.println("Surat berhasil diterima.");
        }
    }

    public Surat15 pop() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        } else {
            return suratStack[top--];
        }
    }

    public Surat15 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return null;
        } else {
            return suratStack[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (suratStack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                suratStack[i].tampilSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
