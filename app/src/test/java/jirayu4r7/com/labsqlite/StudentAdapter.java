package jirayu4r7.com.labsqlite;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {
    private Context context;
    private List<Student> studentList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView idTextView;
        public TextView nameTextView;

        public MyViewHolder(View view) {
            super(view);
            idTextView = view.findViewById(R.id.text_view_id);
            nameTextView = view.findViewById(R.id.text_view_name);
        }
    }

    public StudentAdapter(Context context, List<Student> notesList) {
        this.context = context;
        this.studentList = notesList;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.student_list_row, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Student student = studentList.get(position);
        myViewHolder.idTextView.setText(student.getId());
        myViewHolder.nameTextView.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return studentList.size();

    }
}
