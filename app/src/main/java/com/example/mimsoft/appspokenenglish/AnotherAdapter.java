package com.example.mimsoft.appspokenenglish;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.mimsoft.appspokenenglish.models.WordDetail;
import com.example.mimsoft.appspokenenglish.models.WordGroup;

import java.util.List;


public class AnotherAdapter extends BaseExpandableListAdapter {
    private static final String TAG = AnotherAdapter.class.getSimpleName();
    int flag = -1;
    private final Context mContext;
    private final List<WordGroup> mList;
    LayoutInflater layoutInflater;

    public AnotherAdapter(Context mContext, List<WordGroup> mListDataHeader) {
        this.mContext = mContext;
        this.mList = mListDataHeader;
        layoutInflater = (LayoutInflater) this.mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
//        Log.i(TAG, "getGroupCount: " + mList.size());
        return this.mList.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public WordGroup getGroup(int groupPosition) {
        return this.mList.get(groupPosition);
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        WordGroup headerTitle = getGroup(groupPosition);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.drawer_list_group, parent, false);
        }
        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        //lblListHeader.setTextColor(Color.BLUE);
        lblListHeader.setTextSize(26);
        lblListHeader.setText(headerTitle.title);
        return convertView;
    }

       @Override
    public int getChildrenCount(int groupPosition) {
        return this.mList.get(groupPosition).wordDetails.size();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public WordDetail getChild(int groupPosition, int childPosition) {
        return this.mList.get(groupPosition).wordDetails.get(childPosition);
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        WordDetail childData = getChild(groupPosition,childPosition);
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.drawer_list_child, parent, false);
        }
         final TextView word = (TextView) convertView.findViewById(R.id.word);
        final TextView detail = (TextView) convertView.findViewById(R.id.detail);

        word.setText(childData.word);
        detail.setText(childData.meaning);
        detail.setVisibility(detail.isShown()
                ? View.VISIBLE
                : View.GONE);
        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail.setVisibility(detail.isShown()
                        ? View.GONE
                        : View.VISIBLE);
            }

        });
//
//        word.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (flag != -1
//                        && childPosition != flag) {
//
//                    if (detail.getVisibility() == View.GONE)
//
//                    {
//                        detail.setVisibility(View.VISIBLE);
//                    }
//                }
//                flag = childPosition;
//                detail.setVisibility(View.GONE);
//
//            }
//        });
            return convertView;
        }

        @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
