package com.grandi.bambino.wordtolearn.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.textfield.TextInputEditText
import com.grandi.bambino.wordtolearn.R
import kotlinx.android.synthetic.main.searcn_dialog_fragment.*

class SearchDialogFragment : BottomSheetDialogFragment() {

    private lateinit var searchNewWord: TextInputEditText
    private lateinit var searchButton: Button
    private var clickSearchListener: ClickSearchListener? = null

    companion object {
        fun newInstance() = SearchDialogFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchNewWord = new_search_word_edit_text
        searchButton = search_button

        searchButton.setOnClickListener(clickButtonSearchListener)
        searchNewWord.addTextChangedListener(textWatcher)
    }

    internal fun setSearchClickListener(listener: ClickSearchListener){
        clickSearchListener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = View.inflate(context, R.layout.searcn_dialog_fragment, null)

    override fun onDestroy() {
        clickSearchListener = null
        super.onDestroy()
    }

    interface ClickSearchListener {

        fun onClick(word: String)

    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {

        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            searchButton.isEnabled = searchNewWord.text != null || !searchButton.text.toString().isEmpty()
        }

    }

    private val clickButtonSearchListener =
        View.OnClickListener {
            clickSearchListener?.onClick(searchNewWord.text.toString())
            dismiss()
        }

}
