package com.sebferna.android.quaketracker.settings.presentation.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.sebferna.android.quaketracker.R
import com.sebferna.android.quaketracker.designsystem.SPACING_2
import com.sebferna.android.quaketracker.designsystem.Spinner

@Composable
fun RegionsSpinner(
    availableOptions: List<String>,
    selectedItem: String,
    onItemSelected: (String) -> Unit
) {
    Spinner(
        modifier = Modifier.wrapContentSize(),
        dropDownModifier = Modifier.wrapContentSize(),
        items = availableOptions,
        selectedItem = selectedItem,
        onItemSelected = onItemSelected,
        selectedItemFactory = { modifier, item ->
            Row(
                modifier = modifier
                    .padding(SPACING_2)
                    .wrapContentSize()
            ) {
                Text(item)

                Icon(
                    painter = painterResource(id = R.drawable.arrow_drop_down_black_24dp),
                    contentDescription ="drop down arrow"
                )
            }
        },
        dropdownItemFactory = { item, _ ->
            Text(text = item)
        }

    )
}