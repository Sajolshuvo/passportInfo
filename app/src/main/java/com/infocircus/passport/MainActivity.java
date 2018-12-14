package com.infocircus.passport;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private IndexAdapter adapter;
    private List<Index> indexList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        recyclerView = findViewById(R.id.recycler_view);

        indexList = new ArrayList<>();
        adapter = new IndexAdapter(this, indexList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                // Log.d(TAG, "clicked position:" + position);
                //  long postId = indexList.get(position).getID();
                // do what ever you want to do with it
                Intent i;
                switch (position) {

                    case 0:
                        i = new Intent(MainActivity.this, NewPassport.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(MainActivity.this, ReIssue.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, Forms.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(MainActivity.this, PassportFee.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(MainActivity.this, DivisionalOfiiceList.class);
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(MainActivity.this, Regional.class);
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(MainActivity.this, Ambassy.class);
                        startActivity(i);
                        break;
                    case 7:
                        i = new Intent(MainActivity.this, AboutMe.class);
                        startActivity(i);
                        break;

                }

            }
        });

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.coverrr).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.new_passpost,
                R.drawable.renew_passport,
                R.drawable.form,
                R.drawable.fee,
                R.drawable.divisional,
                R.drawable.regional,
                R.drawable.foreign,
                R.drawable.me
        };

        Index a = new Index("নতুন পাসপোর্ট", covers[0]);
        indexList.add(a);

        a = new Index("পাসপোর্ট নবায়ন", covers[1]);
        indexList.add(a);

        a = new Index("পাসপোর্ট সংক্রান্ত ফরমসমুহ", covers[2]);
        indexList.add(a);

        a = new Index("পাসপোর্ট ফি", covers[3]);
        indexList.add(a);

        a = new Index("বিভাগীয় পাসপোর্ট অফিসসমূহ", covers[4]);
        indexList.add(a);

        a = new Index("আঞ্চলিক পাসপোর্ট অফিসসমূহ", covers[5]);
        indexList.add(a);

        a = new Index("বিদেশস্থ বাংলাদেশ মিশন সমূহ", covers[6]);
        indexList.add(a);
        a = new Index("ডেভেলপারের তথ্য", covers[7]);
        indexList.add(a);


        adapter.notifyDataSetChanged();
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }
}
